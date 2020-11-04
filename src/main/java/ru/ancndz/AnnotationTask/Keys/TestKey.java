package ru.ancndz.AnnotationTask.Keys;

public class TestKey<T> {
    private final T key;

    public TestKey(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
