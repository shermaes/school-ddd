package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Activity implements ValueObject<String> {

    private final String value;

    public Activity(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The activity can not be empty");
        }
    }
    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return value.equals(activity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}