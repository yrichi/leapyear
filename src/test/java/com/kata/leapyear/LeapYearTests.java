package com.kata.leapyear;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeapYearTests {

//    ## Règles
//1. Une année est bissextile si elle est divisible par 4.
//            2. Une année n’est pas bissextile si elle est divisible par 100 mais pas par 400.
//            3. Les autres années ne sont pas bissextiles.
//
//### Exemple de sortie
//    Pour les années suivantes :
//            - 1997 : non bissextile.
//            - 1996 : bissextile.
//- 1900 : non bissextile.
//            - 2000 : bissextile.


    @Test
    public void should_return_true_when_year_is_1996() {
        // GIVEN
        LeapYear leapYear = new LeapYear();
        // WHEN
        boolean result = leapYear.isLeapYear(1996);
        // THEN
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_when_year_is_1997() {
        // GIVEN
        LeapYear leapYear = new LeapYear();
        // WHEN
        boolean result = leapYear.isLeapYear(1997);
        // THEN
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_when_year_is_1998() {
        // GIVEN
        LeapYear leapYear = new LeapYear();
        // WHEN
        boolean result = leapYear.isLeapYear(1998);
        // THEN
        Assertions.assertThat(result).isFalse();
    }




}


