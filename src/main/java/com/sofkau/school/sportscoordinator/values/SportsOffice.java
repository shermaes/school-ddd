package com.sofkau.school.sportscoordinator.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SportsOffice implements ValueObject<Integer> {

    private final Integer value;

    public SportsOffice(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value==0) {
            throw new IllegalArgumentException("The Sports Office can not be empty");
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
        SportsOffice sportsOffice = (SportsOffice) o;
        return value.equals(sportsOffice.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
