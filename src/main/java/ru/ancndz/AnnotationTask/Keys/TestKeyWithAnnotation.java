package ru.ancndz.AnnotationTask.Keys;

import ru.ancndz.AnnotationTask.Annotations.MapKeyFail;

@MapKeyFail
public class TestKeyWithAnnotation<T> extends TestKey<T> {
    public TestKeyWithAnnotation(T key) {
        super(key);
    }
}
