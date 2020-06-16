package boeing;

public class SystemOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private NoseControl plannedNoseControl;

    public SystemOutputVariableSet() {
        plannedNoseControl = null;
    }

    public NoseControl getPlannedNoseControl() {
        return plannedNoseControl;
    }

    public void setPlannedNoseControl(NoseControl plannedNoseControl) {
        this.plannedNoseControl = plannedNoseControl;
    }

    public SystemOutputVariableSet clone() throws CloneNotSupportedException {
        return (SystemOutputVariableSet)super.clone();
    }
}