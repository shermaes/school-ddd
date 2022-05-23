package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Agenda implements ValueObject<String> {

    private final String value;

    public Agenda(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The Agenda can not be empty");
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
        Agenda agenda = (Agenda) o;
        return value.equals(agenda.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

