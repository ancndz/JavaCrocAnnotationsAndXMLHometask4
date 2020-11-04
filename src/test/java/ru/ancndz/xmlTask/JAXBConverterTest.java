package ru.ancndz.xmlTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ancndz.xmlTask.OriginalDataStructure.FilmsList;

import java.io.IOException;

class JAXBConverterTest {

    FilmsList filmsList;
    String xmlString = "<films>" +
            "<films>" +
            "<film>" +
            "<title>Фильм 1</title>" +
            "<description>Описание 1</description>" +
            "<actors>" +
            "<actor name=\"Актер 1\" age=\"30\" role=\"Роль 1\"/>" +
            "<actor name=\"Актер 2\" age=\"23\" role=\"Роль 2\"/>" +
            "<actor name=\"Актер 3\" age=\"40\" role=\"Роль 3\"/>" +
            "</actors>" +
            "</film>" +
            "<film>" +
            "<title>Фильм 2</title>" +
            "<description>Описание 2</description>" +
            "<actors>" +
            "<actor name=\"Актер 4\" age=\"70\" role=\"Роль 4\"/>" +
            "<actor name=\"Актер 2\" age=\"23\" role=\"Роль 5\"/>" +
            "<actor name=\"Актер 3\" age=\"40\" role=\"Роль 6\"/>" +
            "</actors>" +
            "</film>" +
            "</films>" +
            "</films>";

    @Test
    void fromXml() throws IOException {
        JAXBConverter jaxbConverter = new JAXBConverter();

        this.filmsList = jaxbConverter.fromXml(this.xmlString, FilmsList.class);

        Assertions.assertEquals(2, this.filmsList.getFilmList().size());
    }

    @Test
    void toXml() throws IOException {
        JAXBConverter jaxbConverter = new JAXBConverter();
        this.filmsList = jaxbConverter.fromXml(this.xmlString, FilmsList.class);
        String finalXml = jaxbConverter.toXml(this.filmsList);
        Assertions.assertEquals(this.xmlString, finalXml);
    }
}