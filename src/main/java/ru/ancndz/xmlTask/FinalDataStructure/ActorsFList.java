package ru.ancndz.xmlTask.FinalDataStructure;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "actors")
public class ActorsFList {

    @XmlElementWrapper(name = "actors")
    @XmlElement(name = "actor")
    private List<ActorF> actorFList = new ArrayList<>();

    public ActorsFList() {
    }

    public ActorsFList(List<ActorF> actorFList) {
        this.actorFList = actorFList;
    }

    public List<ActorF> getActorFList() {
        return actorFList;
    }

    @Override
    public String toString() {
        return "ActorsFList{\n" +
                "actorFList=" + actorFList +
                '}';
    }

}
