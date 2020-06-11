package smarthome;

import abstractModel.Relation;

import java.util.Random;

public class HumidityMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    private double noiseBoundary;
    private double failureRate;

    public HumidityMonitoringRelation(EnvironmentOutputVariableSet eo, SystemInputVariableSet si){
        EO = eo;
        SI = si;

        noiseBoundary = 1.0;
        failureRate = 0.01;
    }

    public void relationMapping() {
        //todo: eo.indoorHumidity->si.monitoredHumidity
        Double monitoredHumi = null;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //monitoring failure
        else{
            monitoredHumi = EO.getIndoorHumidity();   //accurate monitoring
            monitoredHumi = (monitoredHumi + (random.nextFloat() * noiseBoundary)) - (noiseBoundary / 2);   //inaccurate monitoring
            monitoredHumi = Math.round(monitoredHumi * 100)/100.0;  //inaccurate monitoring
        }
        SI.setMonitoredHumidity(monitoredHumi);
    }
}
