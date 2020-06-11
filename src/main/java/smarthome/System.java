package smarthome;

import abstractModel.Relation;

public class System extends Relation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;

    private double temperatureControlGoal;
    private double humidityControlGoal;
    private double maxTemperatureControl;
    private double minTemperatureControl;
    private double maxHumidityControl;
    private double minHumidityControl;

    public System(SystemInputVariableSet si, SystemOutputVariableSet so){
        SI = si;
        SO = so;

        temperatureControlGoal = 23.5;
        humidityControlGoal = 43.4;
        maxTemperatureControl = 5.0;
        minTemperatureControl = -5.0;
        maxHumidityControl = 5.0;
        minHumidityControl = -5.0;
    }

    public void relationMapping() {
        //todo: value assign to SO depending on value of SI
        if (SI.getMonitoredTemperature() != null){
            double tempControl = temperatureControlGoal - SI.getMonitoredTemperature();
            if (tempControl > maxTemperatureControl){
                SO.setTemperatureControl(maxTemperatureControl);
            }
            else if (tempControl < minTemperatureControl){
                SO.setTemperatureControl((minTemperatureControl));
            }
            else{
                SO.setTemperatureControl(tempControl);
            }
        }

        if (SI.getMonitoredHumidity() != null){
            double humiControl = humidityControlGoal - SI.getMonitoredHumidity();
            if (humiControl > maxHumidityControl){
                SO.setHumidityControl(maxHumidityControl);
            }
            else if (humiControl < minHumidityControl){
                SO.setHumidityControl((minHumidityControl));
            }
            else{
                SO.setHumidityControl(humiControl);
            }
        }
    }
}
