package smarthome;

public class SystemInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Double monitoredTemperature;
    private Double monitoredHumidity;

    public SystemInputVariableSet() {
        this.monitoredTemperature = null;
        this.monitoredHumidity = null;
    }

    public Double getMonitoredTemperature() {
        return monitoredTemperature;
    }

    public void setMonitoredTemperature(Double monitoredTemperature) {
        this.monitoredTemperature = monitoredTemperature;
    }

    public Double getMonitoredHumidity() {
        return monitoredHumidity;
    }

    public void setMonitoredHumidity(Double monitoredHumidity) {
        this.monitoredHumidity = monitoredHumidity;
    }

    public SystemInputVariableSet clone() throws CloneNotSupportedException {
        return (SystemInputVariableSet)super.clone();
    }
}
