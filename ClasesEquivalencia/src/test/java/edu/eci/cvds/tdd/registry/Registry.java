package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }
        else if(p.getAge() < 18){
            return RegisterResult.UNDERAGE;
        }
        else if(p.getAge() <0 || p.getAge() > 120){
            return RegisterResult.INVALID_AGE;
        }

        return RegisterResult.VALID;
    }
}
