package ru.ancndz.AnnotationTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ancndz.AnnotationTask.Annotations.MapKeyFail;
import ru.ancndz.AnnotationTask.Annotations.MapValueFail;
import ru.ancndz.AnnotationTask.Exceptions.PutMapKeyFailException;
import ru.ancndz.AnnotationTask.Exceptions.PutMapValueFailException;
import ru.ancndz.AnnotationTask.Keys.TestKey;
import ru.ancndz.AnnotationTask.Keys.TestKeyWithAnnotation;
import ru.ancndz.AnnotationTask.Values.TestValue;
import ru.ancndz.AnnotationTask.Values.TestValueWithAnnotation;

import java.util.Map;

class HashMapExtendedTest {

    TestKey<Integer> testKey = new TestKey<>(5);
    TestKey<Integer> testKeyWithAnnotation = new TestKeyWithAnnotation<>(9);

    TestValue<String> testValue = new TestValue<>("test5");

    TestValue<String> testValueWithAnnotation = new TestValueWithAnnotation<>("test9");

    Map<TestKey<Integer>, TestValue<String>> testHashMapExtended = new HashMapExtended<>();

    @Test
    void put() {
        Assertions.assertDoesNotThrow(() -> testHashMapExtended.put(testKey, testValue));

        Assertions.assertThrows(PutMapKeyFailException.class, () -> testHashMapExtended.put(testKeyWithAnnotation, testValue));
        Assertions.assertThrows(PutMapValueFailException.class, () -> testHashMapExtended.put(testKey, testValueWithAnnotation));

        Assertions.assertThrows(PutMapKeyFailException.class, () -> testHashMapExtended.put(testKeyWithAnnotation, testValueWithAnnotation));
    }
}