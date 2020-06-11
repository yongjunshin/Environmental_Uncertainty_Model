package smarthome;

import abstractModel.Relation;

public class TemperatureMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    public TemperatureMonitoringRelation(EnvironmentOutputVariableSet eo, SystemInputVariableSet si){
        EO = eo;
        SI = si;
    }

    public void relationMapping() {
        //todo: eo.indoorTemperature->si.monitoredTemperature
        SI.setMonitoredTemperature(EO.getIndoorTemperature());
    }
}
