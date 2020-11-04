package ru.ancndz.AnnotationTask.Values;

public class TestValue<T> {
    private final T value;

    public TestValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
