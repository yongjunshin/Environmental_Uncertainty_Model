package traffic.exeRel;

import abstractModel.Relation;
import traffic.EnvironmentInputVariableSet;
import traffic.Signal;
import traffic.SystemOutputVariableSet;

import java.util.Random;

public class signalExecutionRelation extends Relation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    private int sourceRoad;
    private int destinationRoad;

    //private double noiseBoundary;
    private double failureRate;

    public signalExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei, double failureR, int srcRoad, int destRoad){
        SO = so;
        EI = ei;

        //noiseBoundary = 1.0;
        failureRate = failureR;

        sourceRoad = srcRoad;
        destinationRoad = destRoad;
    }

    public void relationMapping() {
        //todo: so.plannedSignal->ei.executedSignal
        Signal executedSignal = null;
        Random random = new Random();
        if(random.nextFloat() < failureRate);  //execution failure
        else{
            if(SO.getPlannedSignalsSrc2Dest(sourceRoad, destinationRoad) != null){
                executedSignal = SO.getPlannedSignalsSrc2Dest(sourceRoad, destinationRoad);
            }
        }
        EI.setExecutedSignalsSrc2Dest(sourceRoad, destinationRoad, executedSignal);
    }
}
