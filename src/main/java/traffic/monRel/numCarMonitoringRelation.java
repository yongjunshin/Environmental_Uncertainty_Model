package traffic.monRel;

import abstractModel.Relation;
import traffic.EnvironmentOutputVariableSet;
import traffic.SystemInputVariableSet;

import java.util.Random;

public class numCarMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    private int sourceRoad;
    private int destinationRoad;

    private int noiseBoundary;
    private double failureRate;


    public numCarMonitoringRelation(EnvironmentOutputVariableSet eo, SystemInputVariableSet si, int noiseB, double failureR, int srcRoad, int destRoad) {
        EO = eo;
        SI = si;

        noiseBoundary = noiseB;
        failureRate = failureR;

        sourceRoad = srcRoad;
        destinationRoad = destRoad;
    }

    public void relationMapping() {
        //todo: eo.numCar->si.monitoredNumCar
        Integer monitoredNumCar = null;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //monitoring failure
        else{
            monitoredNumCar = EO.getNumCarsSrc2Dest(sourceRoad, destinationRoad);   //accurate monitoring
            monitoredNumCar = monitoredNumCar + (int)Math.round((random.nextFloat() * noiseBoundary) - ((double)noiseBoundary / 2));   //inaccurate monitoring
            if (monitoredNumCar < 0){
                monitoredNumCar = 0;
            }
        }
        SI.setMonitoredNumCarsSrc2Dest(sourceRoad, destinationRoad, monitoredNumCar);
    }
}
