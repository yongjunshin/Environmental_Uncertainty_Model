package smarthome.monRel;

import abstractModel.Relation;
import smarthome.EnvironmentOutputVariableSet;
import smarthome.SystemInputVariableSet;

import java.util.Random;

public class TemperatureMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    private double noiseBoundary;
    private double failureRate;

    public TemperatureMonitoringRelation(EnvironmentOutputVariableSet eo, SystemInputVariableSet si){
        EO = eo;
        SI = si;

        noiseBoundary = 1.0;
        failureRate = 0.01;
    }

    public void relationMapping() {
        //todo: eo.indoorTemperature->si.monitoredTemperature
        Double monitoredTemp = null;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //monitoring failure
        else{
            monitoredTemp = EO.getIndoorTemperature();   //accurate monitoring
            monitoredTemp = (monitoredTemp + (random.nextFloat() * noiseBoundary)) - (noiseBoundary / 2);   //inaccurate monitoring
            monitoredTemp = Math.round(monitoredTemp * 100)/100.0;  //inaccurate monitoring
        }
        SI.setMonitoredTemperature(monitoredTemp);
    }
}
