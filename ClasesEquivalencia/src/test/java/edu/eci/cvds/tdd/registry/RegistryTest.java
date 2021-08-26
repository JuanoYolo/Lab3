package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
	@Test
	public void validateAliveVoter(){
		
		Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
		Assert.assertTrue(result != RegisterResult.DEAD);
		
	}
	public void validateValidEdge(){
		
		Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
		Assert.assertTrue(result != RegisterResult.INVALID_AGE);
		
	}
	

    // TODO Complete with more test cases
}

