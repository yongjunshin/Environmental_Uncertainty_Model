package boeing.exeRel;

import abstractModel.Relation;
import boeing.EnvironmentInputVariableSet;
import boeing.NoseControl;
import boeing.SystemOutputVariableSet;

import java.util.Random;

public class NoseControlExecutionRelation extends Relation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    private double noiseBoundary;
    private double failureRate;

    public NoseControlExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei) {
        SO = so;
        EI = ei;

        noiseBoundary = 1.0;
        failureRate = 0.01;
    }

    public void relationMapping() {
        //todo: so.plannedNoseControl->ei.executedNoseControl
        double executedNoseControl = 0.0;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //execution failure
        else{
            if(SO.getPlannedNoseControl() != null){
                if(SO.getPlannedNoseControl() == NoseControl.UP){   //accurate execution
                    executedNoseControl = 1.0;
                }
                else if (SO.getPlannedNoseControl() == NoseControl.STAY){
                    executedNoseControl = 0.0;
                }
                else{
                    executedNoseControl = -1.0;
                }
                executedNoseControl = (executedNoseControl + (random.nextFloat() * noiseBoundary)) - (noiseBoundary / 2); //inaccurate execution
            }
        }
        EI.setExecutedNoseControl(executedNoseControl);
    }
}