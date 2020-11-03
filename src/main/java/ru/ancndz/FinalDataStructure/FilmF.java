package ru.ancndz.FinalDataStructure;

import javax.xml.bind.annotation.XmlAttribute;

public class FilmF {
    @XmlAttribute(name = "title")
    private String title;
    @XmlAttribute(name = "role")
    private String role;

    public FilmF() {
    }

    public FilmF(String title, String role) {
        this.title = title;
        this.role = role;
    }

    public String getTitle() {
        return title;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "FilmF{\n" +
                "title='" + title + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
