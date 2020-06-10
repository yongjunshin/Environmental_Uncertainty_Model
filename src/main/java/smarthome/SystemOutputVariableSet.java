package smarthome;

public class SystemOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Double temperatureControl;
    private Double humidityControl;

    public SystemOutputVariableSet() {
        this.temperatureControl = null;
        this.humidityControl = null;
    }

    public Double getTemperatureControl() {
        return temperatureControl;
    }

    public void setTemperatureControl(Double temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public Double getHumidityControl() {
        return humidityControl;
    }

    public void setHumidityControl(Double humidityControl) {
        this.humidityControl = humidityControl;
    }

    public SystemOutputVariableSet clone() throws CloneNotSupportedException {
        return (SystemOutputVariableSet)super.clone();
    }
}
