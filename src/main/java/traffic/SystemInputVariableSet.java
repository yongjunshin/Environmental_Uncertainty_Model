package traffic;

public class SystemInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Integer[] monitoredNumCars = new Integer[16];

    public SystemInputVariableSet() {
        for(int i = 0; i < monitoredNumCars.length; i++){
            monitoredNumCars[i] = 0;
        }
    }

    public Integer[] getMonitoredNumCars() {
        return monitoredNumCars;
    }

    public void setMonitoredNumCars(Integer[] monitoredNumCars) {
        this.monitoredNumCars = monitoredNumCars;
    }

    public Integer getMonitoredNumCarsSrc2Dest(int src, int dest) {
        return monitoredNumCars[src * 4 + dest];
    }

    public void setMonitoredNumCarsSrc2Dest(int src, int dest, Integer setNum) {
        this.monitoredNumCars[src * 4 + dest] = setNum;
    }

    public SystemInputVariableSet clone() throws CloneNotSupportedException {
        SystemInputVariableSet c = (SystemInputVariableSet)super.clone();
        c.setMonitoredNumCars(c.getMonitoredNumCars().clone());
        return c;
    }
}
