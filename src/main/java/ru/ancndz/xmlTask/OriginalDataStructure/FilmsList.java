package ru.ancndz.xmlTask.OriginalDataStructure;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "films")
public class FilmsList {

    @XmlElementWrapper(name = "films")
    @XmlElement(name = "film")
    private List<Film> filmList = new ArrayList<>();

    public FilmsList() {
    }

    public FilmsList(List<Film> filmList) {
        this.filmList = filmList;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    @Override
    public String toString() {
        return "FilmsList{" +
                "filmList=" + filmList +
                '}';
    }
}
