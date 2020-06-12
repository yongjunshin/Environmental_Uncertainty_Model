package smarthome.exeRel;

import abstractModel.Relation;
import smarthome.EnvironmentInputVariableSet;
import smarthome.SystemOutputVariableSet;

import java.util.Random;

public class TemperatureControlExecutionRelation extends Relation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    private double noiseBoundary;
    private double failureRate;

    public TemperatureControlExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei){
        SO = so;
        EI = ei;

        noiseBoundary = 1.0;
        failureRate = 0.01;
    }

    public void relationMapping() {
        //todo: so.temperatureControl->ei.executedTemperatureControl
        double executedTemp = 0.0;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //execution failure
        else{
            if(SO.getTemperatureControl() != null){
                executedTemp = SO.getTemperatureControl();  //accurate execution
                executedTemp = (executedTemp + (random.nextFloat() * noiseBoundary)) - (noiseBoundary / 2); //inaccurate execution
            }
        }
        EI.setExecutedTemperatureControl(executedTemp);
    }
}
