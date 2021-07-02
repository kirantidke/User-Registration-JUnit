package com.bridgelabz.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
		boolean result = userRegistration.validateFirstName("Kiran");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Ki");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Kira1");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Kiran@");
		Assert.assertFalse(result);
	}

}
