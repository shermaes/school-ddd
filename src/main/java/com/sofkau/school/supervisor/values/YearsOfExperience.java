package com.sofkau.school.supervisor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class YearsOfExperience implements ValueObject<Integer> {

    private final Integer value;

    public YearsOfExperience(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value == 0) {
            throw new IllegalArgumentException("The YearsOfExperience can not be empty");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearsOfExperience yearsOfExperience = (YearsOfExperience) o;
        return value.equals(yearsOfExperience.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
