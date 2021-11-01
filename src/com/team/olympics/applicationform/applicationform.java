package com.team.olympics.applicationform;

import java.io.*;

public class applicationform implements Cloneable{
    private String country;
    private String name;
    private String age;
    private String sprotEvent;

    public void setCountry(String _country)
    {
        this.country=_country;
    }
    public void setName(String _name)
    {
        this.name = _name;
    }
    public void setAge(String _age)
    {
        this.age = _age;
    }
    public void setSprotEvent(String _sprotEvent)
    {
        this.sprotEvent = _sprotEvent;
    }

    public String getCountry()
    {
        return this.country;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAge()
    {
        return this.age;
    }

    public String getSprotEvent()
    {
        return this.sprotEvent;
    }

    public applicationform clone()
    {
        Object obj = null;
        try{
            obj = super.clone();
            return (applicationform) obj;
        }catch (CloneNotSupportedException e)
        {
            System.out.println("不支持复制");
            return null;
        }
    }

    public applicationform deepClone() throws IOException,ClassNotFoundException, OptionalDataException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(os);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream oss = new ObjectInputStream(in);
        return (applicationform) oss.readObject();
    }
}
