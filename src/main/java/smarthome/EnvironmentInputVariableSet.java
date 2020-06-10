package smarthome;

public class EnvironmentInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private Double executedTemperatureControl;
    private Double executedHumidityControl;

    public EnvironmentInputVariableSet() {
        this.executedTemperatureControl = 0.0;
        this.executedHumidityControl = 0.0;
    }


    public Double getExecutedTemperatureControl() {
        return executedTemperatureControl;
    }

    public void setExecutedTemperatureControl(Double executedTemperatureControl) {
        this.executedTemperatureControl = executedTemperatureControl;
    }

    public Double getExecutedHumidityControl() {
        return executedHumidityControl;
    }

    public void setExecutedHumidityControl(Double executedHumidityControl) {
        this.executedHumidityControl = executedHumidityControl;
    }

    public EnvironmentInputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentInputVariableSet)super.clone();
    }
}
