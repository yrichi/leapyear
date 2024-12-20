package com.kata.leapyear;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


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


    @ParameterizedTest
    @CsvSource({
            "1996",
            "2000"
    })
    public void should_return_true_when_year_is_divisible_by_4(int year) {
        // GIVEN
        LeapYear leapYear = new LeapYear();
        // WHEN
        boolean result = leapYear.isLeapYear(year);
        // THEN
        Assertions.assertThat(result).isTrue();
    }
    @ParameterizedTest
    @CsvSource({
            "1997",
            "1998",
            "1999"
    })
    public void should_return_false_when_year_is_not_divisible_by_4(int year) {
        // GIVEN
        LeapYear leapYear = new LeapYear();
        // WHEN
        boolean result = leapYear.isLeapYear(year);
        // THEN
        Assertions.assertThat(result).isFalse();
    }



}


