package traffic;

public class EnvironmentInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Signal[] executedSignals = new Signal[16];

    public EnvironmentInputVariableSet() {
        for(int i = 0; i < executedSignals.length; i++){
            executedSignals[i] = null;
        }
    }

    public Signal[] getExecutedSignals() {
        return executedSignals;
    }

    public void setExecutedSignals(Signal[] executedSignals) {
        this.executedSignals = executedSignals;
    }

    public Signal getExecutedSignalsSrc2Dest(int src, int dest) {
        return executedSignals[src * 4 + dest];
    }

    public void setExecutedSignalsSrc2Dest(int src, int dest, Signal setSignal) {
        this.executedSignals[src * 4 + dest] = setSignal;
    }

    public EnvironmentInputVariableSet clone() throws CloneNotSupportedException {
        EnvironmentInputVariableSet c = (EnvironmentInputVariableSet)super.clone();
        c.setExecutedSignals(c.getExecutedSignals().clone());

        return c;
    }
}
