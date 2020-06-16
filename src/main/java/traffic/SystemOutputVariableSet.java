package traffic;

public class SystemOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Signal[] plannedSignals = new Signal[16];

    public SystemOutputVariableSet() {
        for(int i = 0; i < plannedSignals.length; i++){
            plannedSignals[i] = null;
        }
    }

    public Signal[] getPlannedSignals() {
        return plannedSignals;
    }

    public void setPlannedSignals(Signal[] plannedSignals) {
        this.plannedSignals = plannedSignals;
    }

    public Signal getPlannedSignalsSrc2Dest(int src, int dest) {
        return plannedSignals[src * 4 + dest];
    }

    public void setPlannedSignalsSrc2Dest(int src, int dest, Signal setSignal) {
        this.plannedSignals[src * 4 + dest] = setSignal;
    }

    public SystemOutputVariableSet clone() throws CloneNotSupportedException {
        SystemOutputVariableSet c = (SystemOutputVariableSet)super.clone();
        c.setPlannedSignals(c.getPlannedSignals().clone());

        return c;
    }
}
