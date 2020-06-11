package smarthome;

import abstractModel.Relation;

public class Environment extends Relation {
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;

    public Environment(EnvironmentInputVariableSet ei, EnvironmentParameterVariableSet ep, EnvironmentOutputVariableSet eo){
        EI = ei;
        EP = ep;
        EO = eo;
    }

    public void relationMapping() {
        //todo: value assign to EO depending on value of EI and EP
        double outdoorTemperatureTransfer = (EP.getOutdoorTemperature() - EO.getIndoorTemperature()) * 0.2;
        double outdoorHumidityTransfer = (EP.getOutdoorHumidity() - EO.getIndoorHumidity()) * 0.2;

        EO.setIndoorTemperature(EO.getIndoorTemperature() + outdoorTemperatureTransfer + EI.getExecutedTemperatureControl());
        EO.setIndoorHumidity(EO.getIndoorHumidity() + outdoorHumidityTransfer + EI.getExecutedHumidityControl());
    }
}
