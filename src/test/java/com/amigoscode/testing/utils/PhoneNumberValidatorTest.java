package com.amigoscode.testing.utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setUp() {
        underTest = new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({"+447000000000, TRUE",
                "+4470000000008878, FALSE",
                "447000000000, FALSE"})
    void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {

        // when
        boolean isValid = underTest.test(phoneNumber);

        // then
        assertThat(isValid).isEqualTo(expected); 
    }

    // @Test
    // void itShouldValidatePhoneNumber() {
    //     // given
    //     String phoneNumber = "+447000000000";

    //     // when
    //     boolean isValid = underTest.test(phoneNumber);

    //     // then
    //     assertThat(isValid).isTrue(); 
    // }

    // @Test
    // @DisplayName("Should fail when length is bigger than 13")
    // void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThan13() {
    //     // given
    //     String phoneNumber = "+4470000000008878";

    //     // when
    //     boolean isValid = underTest.test(phoneNumber);

    //     // then
    //     assertThat(isValid).isFalse();
    // }

    // @Test
    // @DisplayName("Should fail when does not start with +")
    // void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign() {
    //     // given
    //     String phoneNumber = "447000000000";

    //     // when
    //     boolean isValid = underTest.test(phoneNumber);

    //     // then
    //     assertThat(isValid).isFalse(); 
    // }
}
