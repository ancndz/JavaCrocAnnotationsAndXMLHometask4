package ru.ancndz.xmlTask.OriginalDataStructure;

import javax.xml.bind.annotation.XmlAttribute;

public class Actor {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private int age;
    @XmlAttribute
    private String role;

    public Actor() {
    }

    public Actor(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "ActorF{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
