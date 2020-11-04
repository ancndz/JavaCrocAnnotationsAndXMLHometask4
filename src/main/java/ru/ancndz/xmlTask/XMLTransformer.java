package ru.ancndz.xmlTask;

import ru.ancndz.xmlTask.FinalDataStructure.ActorF;
import ru.ancndz.xmlTask.FinalDataStructure.FilmF;
import ru.ancndz.xmlTask.OriginalDataStructure.Actor;
import ru.ancndz.xmlTask.FinalDataStructure.ActorsFList;
import ru.ancndz.xmlTask.OriginalDataStructure.Film;
import ru.ancndz.xmlTask.OriginalDataStructure.FilmsList;

import java.io.IOException;
import java.util.ArrayList;

public class XMLTransformer {

    public String transform(String originalXML) throws IOException {
        ActorsFList actorsFList = new ActorsFList(new ArrayList<>());
        JAXBConverter jaxbConverter = new JAXBConverter();
        FilmsList filmsList = jaxbConverter.fromXml(originalXML, FilmsList.class);
        //идем по всем фильмам (старая версия хранения)
        for (Film eachFilm: filmsList.getFilmList()) {
            //идем по всем актерам фильма
            for (Actor eachActor: eachFilm.getActorList()) {
                //флаг, если актер уже существует в новом списке
                boolean flagIfActorExist = false;
                //заранее создаем объект фильма (нового хранения) с определенной ролью
                FilmF filmF = new FilmF(eachFilm.getTitle(), eachActor.getRole());
                //просматриваем каждого актера в новом списке, ищем совпадение
                for (ActorF eachActorF: actorsFList.getActorFList()) {
                    //если нашли, флаг - тру и выходим из цикла, добавив ему новый фильм с новой ролью
                    if (eachActor.getName().equals(eachActorF.getName())) {
                        eachActorF.getFilmFList().add(filmF);
                        flagIfActorExist = true;
                        break;
                    }
                }
                //если не нали такого актера в новом списке (он для нас новый), создаем и добавляем ему фильм с ролью и кидаем в список актеров
                if (!flagIfActorExist) {
                    ActorF actorF = new ActorF(eachActor.getName(), eachActor.getAge(), new ArrayList<>());
                    actorF.getFilmFList().add(filmF);
                    actorsFList.getActorFList().add(actorF);
                }
            }
        }
        return jaxbConverter.toXml(actorsFList);
    }

}
