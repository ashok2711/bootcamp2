package org.tw.unitcheck;

import java.util.Objects;

public class Length {

    private final double magnitude;
    private Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        Unit unit = Unit.valueOf(length.getUnit().name());

        double parameterObjectCentimeters = unit.getCentimeters();
        double parameterObjectLengthInCms = length.getMagnitude() * parameterObjectCentimeters;

        double thisObjectCentimeters = this.unit.getCentimeters();
        double thisObjectLengthInCms = this.getMagnitude() * thisObjectCentimeters;

        if (this == o) return true;
        return thisObjectLengthInCms == parameterObjectLengthInCms && Objects.equals(unit, length.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }

    public boolean checkObjectsAreSame(Length l2) {
        return this == l2;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public Unit getUnit() {
        return unit;
    }

}
