package com.team.olympics.person;


public  abstract class Person {

    public String identity = "person";
    protected String name;
    protected int age;
    public enum Sex {
        MALE, FEMALE
    }
    protected Sex sex;
    protected String nation;


    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * @param name the person's new name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * set the age of the person
     *
     * @param age the modified age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return age of the person
     */
    public int getAge() {
        return this.age;
    }

    /**
     * set the sex of the person
     *
     * @param sex the modified sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    /**
     * @return sex of the person
     */
    public Sex getSex() {
        return this.sex;
    }

    /**
     * set the nation of the person
     *
     * @param nation the modified nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }
    /**
     * @return nation of the person
     */
    public String getNation() {
        return this.nation;
    }

    @Override
    public String toString() {
        return "abstract class Person";
    }
}
