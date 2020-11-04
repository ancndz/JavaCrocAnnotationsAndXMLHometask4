package ru.ancndz.AnnotationTask;

import ru.ancndz.AnnotationTask.Exceptions.PutMapValueFailException;
import ru.ancndz.AnnotationTask.Annotations.MapKeyFail;
import ru.ancndz.AnnotationTask.Annotations.MapValueFail;
import ru.ancndz.AnnotationTask.Exceptions.PutMapKeyFailException;

import java.util.HashMap;

public class HashMapExtended<K, V> extends HashMap<K, V> {
    @Override
    public V put(K key, V value) throws PutMapKeyFailException, PutMapValueFailException {
        if (key.getClass().isAnnotationPresent(MapKeyFail.class)) {
            throw new PutMapKeyFailException();
        }
        if (value.getClass().isAnnotationPresent(MapValueFail.class)) {
            throw new PutMapValueFailException();
        }
        return super.put(key, value);
    }
}
