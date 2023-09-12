package org.tw.unitcheck;

import java.util.Objects;

public class Length {

    private final double magnitude;
    private final Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        Unit unit = Unit.valueOf(length.getUnit().name());

        double parameterObjectLengthInCms = this.getCentimetersBasedOnUnit(length);
        double thisObjectLengthInCms = this.getCentimetersBasedOnUnit(this);

        if (this == o) return true;
        return thisObjectLengthInCms == parameterObjectLengthInCms && Objects.equals(unit, length.unit);
    }

    private double getCentimetersBasedOnUnit(Length length) {
        double parameterObjectCentimeters = length.getUnit().getCentimeters();
        return length.getMagnitude() * parameterObjectCentimeters;
    }

    private double getMetersBasedOnUnit(Length length) {
        double parameterObjectCentimeters = length.getUnit().getCentimeters();
        return length.getMagnitude() / parameterObjectCentimeters;
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

    public Length addLength(Length length) {

        double parameterObjectLengthInCms = this.getCentimetersBasedOnUnit(length);
        double thisObjectLengthInCms = this.getCentimetersBasedOnUnit(this);

        double totalLengthInCentimeters = parameterObjectLengthInCms + thisObjectLengthInCms;
        Length resultInMeters= new Length(totalLengthInCentimeters, Unit.M);

        return new Length(this.getMetersBasedOnUnit(resultInMeters), Unit.M);
    }
}
