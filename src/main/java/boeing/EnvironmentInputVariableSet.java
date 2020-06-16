package boeing;

public class EnvironmentInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private double executedNoseControl;

    public EnvironmentInputVariableSet() {
        executedNoseControl = 0.0;
    }

    public double getExecutedNoseControl() {
        return executedNoseControl;
    }

    public void setExecutedNoseControl(double executedNoseControl) {
        this.executedNoseControl = executedNoseControl;
    }

    public EnvironmentInputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentInputVariableSet)super.clone();
    }
}