package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private final Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Bruce",3,99,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateisAlivepeople(){
        Person person = new Person("cesar",1,19,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateisUnderAge(){
        Person person1 = new Person("Camila",2,17,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person1);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    // TODO Complete with more test cases
}

