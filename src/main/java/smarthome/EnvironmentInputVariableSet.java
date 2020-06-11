package smarthome;

public class EnvironmentInputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private double executedTemperatureControl;
    private double executedHumidityControl;

    public EnvironmentInputVariableSet() {
        this.executedTemperatureControl = 0.0;
        this.executedHumidityControl = 0.0;
    }


    public double getExecutedTemperatureControl() {
        return executedTemperatureControl;
    }

    public void setExecutedTemperatureControl(double executedTemperatureControl) {
        this.executedTemperatureControl = executedTemperatureControl;
    }

    public double getExecutedHumidityControl() {
        return executedHumidityControl;
    }

    public void setExecutedHumidityControl(double executedHumidityControl) {
        this.executedHumidityControl = executedHumidityControl;
    }

    public EnvironmentInputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentInputVariableSet)super.clone();
    }
}
