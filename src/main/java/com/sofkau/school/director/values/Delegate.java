package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Delegate implements ValueObject<String> {

    private final String value;

    public Delegate(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The Delegate name can not be empty");
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
        Delegate delegate = (Delegate) o;
        return value.equals(delegate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
