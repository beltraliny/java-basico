package com.github.beltraliny.classes;

import java.util.Objects;

public class EqualsEHashCode {

    int intType;
    double doubleType;

    /*
        É uma boa prática a implementação do equals e do hasCode
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsEHashCode that = (EqualsEHashCode) o;

        return intType == that.intType && Double.compare(doubleType, that.doubleType) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intType, doubleType);
    }
}
