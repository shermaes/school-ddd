package com.sofkau.school.supervisor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Subject implements ValueObject<String> {

    private final String value;

    public Subject(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The Subject name can not be empty");
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
        Subject subject = (Subject) o;
        return value.equals(subject.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
