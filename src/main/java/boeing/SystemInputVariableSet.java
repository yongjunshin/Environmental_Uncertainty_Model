package boeing;

public class SystemInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Double monitoredAngleOfAttack;

    public SystemInputVariableSet() {
        this.monitoredAngleOfAttack = null;
    }

    public Double getMonitoredAngleOfAttack() {
        return monitoredAngleOfAttack;
    }

    public void setMonitoredAngleOfAttack(Double monitoredAngleOfAttack) {
        this.monitoredAngleOfAttack = monitoredAngleOfAttack;
    }

    public SystemInputVariableSet clone() throws CloneNotSupportedException {
        return (SystemInputVariableSet)super.clone();
    }
}
