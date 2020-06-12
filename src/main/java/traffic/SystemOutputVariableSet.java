package traffic;

public class SystemOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Signal plannedSignalAtoB;
    private Signal plannedSignalAtoC;
    private Signal plannedSignalAtoD;

    private Signal plannedSignalBtoA;
    private Signal plannedSignalBtoC;
    private Signal plannedSignalBtoD;

    private Signal plannedSignalCtoA;
    private Signal plannedSignalCtoB;
    private Signal plannedSignalCtoD;

    private Signal plannedSignalDtoA;
    private Signal plannedSignalDtoB;
    private Signal plannedSignalDtoC;

    public SystemOutputVariableSet() {
        this.plannedSignalAtoB = null;
        this.plannedSignalAtoC = null;
        this.plannedSignalAtoD = null;

        this.plannedSignalBtoA = null;
        this.plannedSignalBtoC = null;
        this.plannedSignalBtoD = null;

        this.plannedSignalCtoA = null;
        this.plannedSignalCtoB = null;
        this.plannedSignalCtoD = null;

        this.plannedSignalDtoA = null;
        this.plannedSignalDtoB = null;
        this.plannedSignalDtoC = null;
    }

    public Signal getPlannedSignalAtoB() {
        return plannedSignalAtoB;
    }

    public void setPlannedSignalAtoB(Signal plannedSignalAtoB) {
        this.plannedSignalAtoB = plannedSignalAtoB;
    }

    public Signal getPlannedSignalAtoC() {
        return plannedSignalAtoC;
    }

    public void setPlannedSignalAtoC(Signal plannedSignalAtoC) {
        this.plannedSignalAtoC = plannedSignalAtoC;
    }

    public Signal getPlannedSignalAtoD() {
        return plannedSignalAtoD;
    }

    public void setPlannedSignalAtoD(Signal plannedSignalAtoD) {
        this.plannedSignalAtoD = plannedSignalAtoD;
    }

    public Signal getPlannedSignalBtoA() {
        return plannedSignalBtoA;
    }

    public void setPlannedSignalBtoA(Signal plannedSignalBtoA) {
        this.plannedSignalBtoA = plannedSignalBtoA;
    }

    public Signal getPlannedSignalBtoC() {
        return plannedSignalBtoC;
    }

    public void setPlannedSignalBtoC(Signal plannedSignalBtoC) {
        this.plannedSignalBtoC = plannedSignalBtoC;
    }

    public Signal getPlannedSignalBtoD() {
        return plannedSignalBtoD;
    }

    public void setPlannedSignalBtoD(Signal plannedSignalBtoD) {
        this.plannedSignalBtoD = plannedSignalBtoD;
    }

    public Signal getPlannedSignalCtoA() {
        return plannedSignalCtoA;
    }

    public void setPlannedSignalCtoA(Signal plannedSignalCtoA) {
        this.plannedSignalCtoA = plannedSignalCtoA;
    }

    public Signal getPlannedSignalCtoB() {
        return plannedSignalCtoB;
    }

    public void setPlannedSignalCtoB(Signal plannedSignalCtoB) {
        this.plannedSignalCtoB = plannedSignalCtoB;
    }

    public Signal getPlannedSignalCtoD() {
        return plannedSignalCtoD;
    }

    public void setPlannedSignalCtoD(Signal plannedSignalCtoD) {
        this.plannedSignalCtoD = plannedSignalCtoD;
    }

    public Signal getPlannedSignalDtoA() {
        return plannedSignalDtoA;
    }

    public void setPlannedSignalDtoA(Signal plannedSignalDtoA) {
        this.plannedSignalDtoA = plannedSignalDtoA;
    }

    public Signal getPlannedSignalDtoB() {
        return plannedSignalDtoB;
    }

    public void setPlannedSignalDtoB(Signal plannedSignalDtoB) {
        this.plannedSignalDtoB = plannedSignalDtoB;
    }

    public Signal getPlannedSignalDtoC() {
        return plannedSignalDtoC;
    }

    public void setPlannedSignalDtoC(Signal plannedSignalDtoC) {
        this.plannedSignalDtoC = plannedSignalDtoC;
    }

    public SystemOutputVariableSet clone() throws CloneNotSupportedException {
        return (SystemOutputVariableSet)super.clone();
    }
}
