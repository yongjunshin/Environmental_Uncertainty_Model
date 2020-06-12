package traffic;

public class SystemInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Integer monitoredNumCarAtoC;
    private Integer monitoredNumCarAtoD;
    private Integer monitoredNumCarAtoB;

    private Integer monitoredNumCarBtoA;
    private Integer monitoredNumCarBtoC;
    private Integer monitoredNumCarBtoD;

    private Integer monitoredNumCarCtoA;
    private Integer monitoredNumCarCtoB;
    private Integer monitoredNumCarCtoD;

    private Integer monitoredNumCarDtoA;
    private Integer monitoredNumCarDtoB;
    private Integer monitoredNumCarDtoC;

    public SystemInputVariableSet() {
        this.monitoredNumCarAtoC = null;
        this.monitoredNumCarAtoD = null;
        this.monitoredNumCarAtoB = null;

        this.monitoredNumCarBtoA = null;
        this.monitoredNumCarBtoC = null;
        this.monitoredNumCarBtoD = null;

        this.monitoredNumCarCtoA = null;
        this.monitoredNumCarCtoB = null;
        this.monitoredNumCarCtoD = null;

        this.monitoredNumCarDtoA = null;
        this.monitoredNumCarDtoB = null;
        this.monitoredNumCarDtoC = null;
    }

    public Integer getMonitoredNumCarAtoC() {
        return monitoredNumCarAtoC;
    }

    public void setMonitoredNumCarAtoC(Integer monitoredNumCarAtoC) {
        this.monitoredNumCarAtoC = monitoredNumCarAtoC;
    }

    public Integer getMonitoredNumCarAtoD() {
        return monitoredNumCarAtoD;
    }

    public void setMonitoredNumCarAtoD(Integer monitoredNumCarAtoD) {
        this.monitoredNumCarAtoD = monitoredNumCarAtoD;
    }

    public Integer getMonitoredNumCarAtoB() {
        return monitoredNumCarAtoB;
    }

    public void setMonitoredNumCarAtoB(Integer monitoredNumCarAtoB) {
        this.monitoredNumCarAtoB = monitoredNumCarAtoB;
    }

    public Integer getMonitoredNumCarBtoA() {
        return monitoredNumCarBtoA;
    }

    public void setMonitoredNumCarBtoA(Integer monitoredNumCarBtoA) {
        this.monitoredNumCarBtoA = monitoredNumCarBtoA;
    }

    public Integer getMonitoredNumCarBtoC() {
        return monitoredNumCarBtoC;
    }

    public void setMonitoredNumCarBtoC(Integer monitoredNumCarBtoC) {
        this.monitoredNumCarBtoC = monitoredNumCarBtoC;
    }

    public Integer getMonitoredNumCarBtoD() {
        return monitoredNumCarBtoD;
    }

    public void setMonitoredNumCarBtoD(Integer monitoredNumCarBtoD) {
        this.monitoredNumCarBtoD = monitoredNumCarBtoD;
    }

    public Integer getMonitoredNumCarCtoA() {
        return monitoredNumCarCtoA;
    }

    public void setMonitoredNumCarCtoA(Integer monitoredNumCarCtoA) {
        this.monitoredNumCarCtoA = monitoredNumCarCtoA;
    }

    public Integer getMonitoredNumCarCtoB() {
        return monitoredNumCarCtoB;
    }

    public void setMonitoredNumCarCtoB(Integer monitoredNumCarCtoB) {
        this.monitoredNumCarCtoB = monitoredNumCarCtoB;
    }

    public Integer getMonitoredNumCarCtoD() {
        return monitoredNumCarCtoD;
    }

    public void setMonitoredNumCarCtoD(Integer monitoredNumCarCtoD) {
        this.monitoredNumCarCtoD = monitoredNumCarCtoD;
    }

    public Integer getMonitoredNumCarDtoA() {
        return monitoredNumCarDtoA;
    }

    public void setMonitoredNumCarDtoA(Integer monitoredNumCarDtoA) {
        this.monitoredNumCarDtoA = monitoredNumCarDtoA;
    }

    public Integer getMonitoredNumCarDtoB() {
        return monitoredNumCarDtoB;
    }

    public void setMonitoredNumCarDtoB(Integer monitoredNumCarDtoB) {
        this.monitoredNumCarDtoB = monitoredNumCarDtoB;
    }

    public Integer getMonitoredNumCarDtoC() {
        return monitoredNumCarDtoC;
    }

    public void setMonitoredNumCarDtoC(Integer monitoredNumCarDtoC) {
        this.monitoredNumCarDtoC = monitoredNumCarDtoC;
    }

    public SystemInputVariableSet clone() throws CloneNotSupportedException {
        return (SystemInputVariableSet)super.clone();
    }
}
