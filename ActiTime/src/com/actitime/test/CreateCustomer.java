package com.actitime.test;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
@Test
public void testCreateCustomer()  {
	
	Reporter.log("TEst complete",true);
	Assert.fail();
}

}
