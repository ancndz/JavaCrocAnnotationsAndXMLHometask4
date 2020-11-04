package ru.ancndz.AnnotationTask.Values;

import ru.ancndz.AnnotationTask.Annotations.MapValueFail;

@MapValueFail
public class TestValueWithAnnotation<T> extends TestValue<T> {
    public TestValueWithAnnotation(T value) {
        super(value);
    }
}
