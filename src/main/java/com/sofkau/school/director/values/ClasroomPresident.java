package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ClasroomPresident implements ValueObject<String> {

    private final String value;

    public ClasroomPresident(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The Clasroom President name can not be empty");
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
        ClasroomPresident clasroomPresident = (ClasroomPresident) o;
        return value.equals(clasroomPresident.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}