package ru.ancndz.xmlTask.OriginalDataStructure;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class Film {
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String desc;
    @XmlElementWrapper(name = "actors")
    @XmlElement(name = "actor")
    private List<Actor> actorList = new ArrayList<>();

    public Film() {
    }

    public Film(String title, String desc, List<Actor> actorList) {
        this.title = title;
        this.desc = desc;
        this.actorList = actorList;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public List<Actor> getActorList() {
        return actorList;
    }



    @Override
    public String toString() {
        return "FilmF{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", actorList=" + actorList +
                '}';
    }
}
