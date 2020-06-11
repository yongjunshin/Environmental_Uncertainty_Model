package smarthome;

import abstractModel.Relation;

public class HumidityMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    public HumidityMonitoringRelation(EnvironmentOutputVariableSet eo, SystemInputVariableSet si){
        EO = eo;
        SI = si;
    }

    public void relationMapping() {
        //todo: eo.indoorTemperature->si.monitoredTemperature
        SI.setMonitoredHumidity(EO.getIndoorHumidity());
    }
}
