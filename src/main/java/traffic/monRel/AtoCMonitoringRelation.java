package traffic.monRel;

import abstractModel.Relation;
import traffic.EnvironmentOutputVariableSet;
import traffic.SystemInputVariableSet;

import java.util.Random;

public class AtoCMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    private int noiseBoundary;
    private double failureRate;

    public void relationMapping(EnvironmentOutputVariableSet eo, SystemInputVariableSet si) {
        EO = eo;
        SI = si;

        noiseBoundary = 1;
        failureRate = 0.01;
    }

    public void relationMapping() {
        //todo: eo.numCar->si.monitoredNumCar
        Integer monitoredNumCar = null;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //monitoring failure
        else{
            monitoredNumCar = EO.getNumCarAtoC();   //accurate monitoring
            monitoredNumCar = monitoredNumCar + (int)Math.round((random.nextFloat() * noiseBoundary) - ((double)noiseBoundary / 2));   //inaccurate monitoring
        }
        SI.setMonitoredNumCarAtoC(monitoredNumCar);
    }
}
