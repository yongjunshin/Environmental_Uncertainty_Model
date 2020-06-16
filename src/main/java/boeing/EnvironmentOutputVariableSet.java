package boeing;

public class EnvironmentOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private double angleOfAttack;

    public EnvironmentOutputVariableSet() {
        this.angleOfAttack = 1.5;
    }

    public double getAngleOfAttack() {
        return angleOfAttack;
    }

    public void setAngleOfAttack(double angleOfAttack) {
        this.angleOfAttack = angleOfAttack;
    }

    public EnvironmentOutputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentOutputVariableSet)super.clone();
    }
}
