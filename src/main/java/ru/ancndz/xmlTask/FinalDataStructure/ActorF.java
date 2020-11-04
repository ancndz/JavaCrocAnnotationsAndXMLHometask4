package ru.ancndz.xmlTask.FinalDataStructure;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "actor")
public class ActorF {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "age")
    private int age;
    @XmlElementWrapper(name = "films")
    @XmlElement(name = "film")
    private List<FilmF> filmFList = new ArrayList<>();

    public ActorF() {
    }

    public ActorF(String name, int age, List<FilmF> filmFList) {
        this.name = name;
        this.age = age;
        this.filmFList = filmFList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<FilmF> getFilmFList() {
        return filmFList;
    }

    @Override
    public String toString() {
        return "\nActorF{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", filmFList=\n" + filmFList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActorF)) return false;
        ActorF actorF = (ActorF) o;
        return name.equals(actorF.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
