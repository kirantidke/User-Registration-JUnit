package com.bridgelabz.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for User Registration.
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
	@Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
	    boolean result = userRegistration.validateLastName("Tidke");
	    Assert.assertTrue(result);
	}
	  @Test
	  public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
	      boolean result = userRegistration.validateFirstName("Ti");
	      Assert.assertFalse(result);
	  }

	  @Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
	      boolean result = userRegistration.validateFirstName("Tidke1");
	      Assert.assertFalse(result);
	  }

	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
	      boolean result = userRegistration.validateFirstName("Tidke@");
	      Assert.assertFalse(result);
	  }
	
	 @Test
	    public void givenEmailId_WhenProper_ShouldReturnTrue(){
	        boolean result = userRegistration.valudateEmailId("abc.syz@bl.co.in");
	        Assert.assertTrue(result);
	    }


}
