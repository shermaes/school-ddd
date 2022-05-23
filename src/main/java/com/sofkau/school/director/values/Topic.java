package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Topic implements ValueObject<String> {

    private final String value;

    public Topic(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The Topic name can not be empty");
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
        Topic topic = (Topic) o;
        return value.equals(topic.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
