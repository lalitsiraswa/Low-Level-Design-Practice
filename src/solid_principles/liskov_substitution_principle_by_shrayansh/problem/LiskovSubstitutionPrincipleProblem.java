package solid_principles.liskov_substitution_principle_by_shrayansh.problem;

interface Bike {
    void turnOnEngine();

    void accelerate();
}

class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
//        Turn on the engine:
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
//        Increase the speed
        speed += 10;
    }
}

class Bicycle implements Bike {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine!");
    }

    @Override
    public void accelerate() {
//        Do something
    }
}

public class LiskovSubstitutionPrincipleProblem {
}
