package traffic;

public class EnvironmentInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Signal executedSignalAtoB;
    private Signal executedSignalAtoC;
    private Signal executedSignalAtoD;

    private Signal executedSignalBtoA;
    private Signal executedSignalBtoC;
    private Signal executedSignalBtoD;

    private Signal executedSignalCtoA;
    private Signal executedSignalCtoB;
    private Signal executedSignalCtoD;

    private Signal executedSignalDtoA;
    private Signal executedSignalDtoB;
    private Signal executedSignalDtoC;

    public EnvironmentInputVariableSet() {
        this.executedSignalAtoB = null;
        this.executedSignalAtoC = null;
        this.executedSignalAtoD = null;
        this.executedSignalBtoA = null;
        this.executedSignalBtoC = null;
        this.executedSignalBtoD = null;
        this.executedSignalCtoA = null;
        this.executedSignalCtoB = null;
        this.executedSignalCtoD = null;
        this.executedSignalDtoA = null;
        this.executedSignalDtoB = null;
        this.executedSignalDtoC = null;
    }

    public Signal getExecutedSignalAtoB() {
        return executedSignalAtoB;
    }

    public void setExecutedSignalAtoB(Signal executedSignalAtoB) {
        this.executedSignalAtoB = executedSignalAtoB;
    }

    public Signal getExecutedSignalAtoC() {
        return executedSignalAtoC;
    }

    public void setExecutedSignalAtoC(Signal executedSignalAtoC) {
        this.executedSignalAtoC = executedSignalAtoC;
    }

    public Signal getExecutedSignalAtoD() {
        return executedSignalAtoD;
    }

    public void setExecutedSignalAtoD(Signal executedSignalAtoD) {
        this.executedSignalAtoD = executedSignalAtoD;
    }

    public Signal getExecutedSignalBtoA() {
        return executedSignalBtoA;
    }

    public void setExecutedSignalBtoA(Signal executedSignalBtoA) {
        this.executedSignalBtoA = executedSignalBtoA;
    }

    public Signal getExecutedSignalBtoC() {
        return executedSignalBtoC;
    }

    public void setExecutedSignalBtoC(Signal executedSignalBtoC) {
        this.executedSignalBtoC = executedSignalBtoC;
    }

    public Signal getExecutedSignalBtoD() {
        return executedSignalBtoD;
    }

    public void setExecutedSignalBtoD(Signal executedSignalBtoD) {
        this.executedSignalBtoD = executedSignalBtoD;
    }

    public Signal getExecutedSignalCtoA() {
        return executedSignalCtoA;
    }

    public void setExecutedSignalCtoA(Signal executedSignalCtoA) {
        this.executedSignalCtoA = executedSignalCtoA;
    }

    public Signal getExecutedSignalCtoB() {
        return executedSignalCtoB;
    }

    public void setExecutedSignalCtoB(Signal executedSignalCtoB) {
        this.executedSignalCtoB = executedSignalCtoB;
    }

    public Signal getExecutedSignalCtoD() {
        return executedSignalCtoD;
    }

    public void setExecutedSignalCtoD(Signal executedSignalCtoD) {
        this.executedSignalCtoD = executedSignalCtoD;
    }

    public Signal getExecutedSignalDtoA() {
        return executedSignalDtoA;
    }

    public void setExecutedSignalDtoA(Signal executedSignalDtoA) {
        this.executedSignalDtoA = executedSignalDtoA;
    }

    public Signal getExecutedSignalDtoB() {
        return executedSignalDtoB;
    }

    public void setExecutedSignalDtoB(Signal executedSignalDtoB) {
        this.executedSignalDtoB = executedSignalDtoB;
    }

    public Signal getExecutedSignalDtoC() {
        return executedSignalDtoC;
    }

    public void setExecutedSignalDtoC(Signal executedSignalDtoC) {
        this.executedSignalDtoC = executedSignalDtoC;
    }

    public EnvironmentInputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentInputVariableSet)super.clone();
    }
}
