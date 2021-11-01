package com.team.olympics.di;

import com.team.olympics.player.DIPlayer;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DI(Dependency Injection) or IoC(Inversion of Control) principle: no direct new for an object, use reflection to create one
 * @author Charles Gao
 * @description the class for setter injection from XML file
 * @date 2021/10/26
 */
public class SetterInjection
{
    // for DI features, using Object instead of Player
    private Map<String, Object> beans = new HashMap<>();
    private String filePath;

    public SetterInjection(String filePath) {
        this.filePath = filePath;
        this.resolveXML();
    }

    /**
     * The XML resolving function
     * ATTENTION: I will use many reflections in this function, read the comments!
     */
    public void resolveXML()
    {
        String classPath = "";
        String id="";
        Class<?> clazz = null;
        Constructor<?> constructor;
        Object object = null;
        // starting to resolve the XML file
        try
        {
            XMLStreamReader xmlStreamReader = XMLInputFactory.newInstance()
                                                             .createXMLStreamReader(new FileInputStream(this.filePath));
            // while reading the XML file...
            while(xmlStreamReader.hasNext())
            {
                int event = xmlStreamReader.next();
                // start mark
                if(event == XMLEvent.START_ELEMENT)
                {
                    switch (xmlStreamReader.getName().toString()) {
                        // enter the bean resolving
                        case "bean":
                        {
                            for(int i = 0;i < xmlStreamReader.getAttributeCount();i++)
                            {
                                // resolving id and class
                               switch (xmlStreamReader.getAttributeName(i).toString())
                               {
                                   case "id":
                                   {
                                       id = xmlStreamReader.getAttributeValue(i);
                                       break;
                                   }
                                   case "class":
                                   {
                                       classPath = xmlStreamReader.getAttributeValue(i);
                                       break;
                                   }
                               }
                            }
                            clazz = Class.forName(classPath);
                            constructor = clazz.getConstructor();
                            // ATTENTION!! abstract class and interfaces cannot be instantiated by reflection!!
                            object = constructor.newInstance();
                            break;
                        }
                        // reflection on creating an object
                        case "attribute":
                        {
                            if(object !=null)
                            {
                                String method;  // get the method name by the "key" attribute
                                Field field = null; // get the field of the class
                                Method methodPlayer = null; // get the method of the class
                                Object value = null; // the value of one field

                                // resolving key and value from XML
                                for(int i = 0;i<xmlStreamReader.getAttributeCount();i++)
                                {
                                    switch (xmlStreamReader.getAttributeName(i).toString())
                                    {
                                        case "key":
                                        {
                                            String name = xmlStreamReader.getAttributeValue(i);
                                            method = "set"+name.substring(0,1).toUpperCase()+name.substring(1); // the name of the method to be invoked
                                            field = clazz.getDeclaredField(name); // get the field by reflection
                                            methodPlayer = clazz.getDeclaredMethod(method,field.getType());
                                            break;
                                        }
                                        case "value":
                                        {
                                            if(field != null)
                                            {
                                                value = xmlStreamReader.getAttributeValue(i);
                                            }
                                            // invoke the set* method by reflection
                                            assert methodPlayer != null;
                                            methodPlayer.invoke(object,value);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }

                }
                // end mark
                else if(event == XMLEvent.END_ELEMENT)
                {
                    // a complete object read, store it in a hashmap
                    if(xmlStreamReader.getName().toString().equals("bean"))
                    {
                        beans.put(id,object);
                    }
                }
            }

        }
        catch (XMLStreamException | FileNotFoundException| ClassNotFoundException
                | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | NoSuchFieldException e)
        {
            e.printStackTrace();
            System.out.println("Exception on reflection! Exiting the test...");
        }
    }
    public List<DIPlayer> getAllPlayers()
    {
        List<DIPlayer> ret = new ArrayList<>();
        for(String key:this.beans.keySet())
        {
            ret.add((DIPlayer) this.beans.get(key));
        }
        return ret;
    }
}



