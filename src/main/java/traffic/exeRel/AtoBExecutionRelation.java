package traffic.exeRel;

import traffic.EnvironmentInputVariableSet;
import traffic.SystemOutputVariableSet;

public class AtoBExecutionRelation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    //private double noiseBoundary;
    private double failureRate;

    public AtoBExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei){
        SO = so;
        EI = ei;

        //noiseBoundary = 1.0;
        failureRate = 0.01;
    }

    public void relationMapping() {
        //todo: so.plannedSignal->ei.executedSignal
    }
}
