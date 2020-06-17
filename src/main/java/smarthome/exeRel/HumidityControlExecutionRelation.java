package smarthome.exeRel;

import abstractModel.Relation;
import smarthome.EnvironmentInputVariableSet;
import smarthome.SystemOutputVariableSet;

import java.util.Random;

public class HumidityControlExecutionRelation extends Relation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    private double noiseBoundary;
    private double failureRate;

    public HumidityControlExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei) {
        SO = so;
        EI = ei;

        noiseBoundary = 1.0;
        failureRate = 0.05;
    }

    public void relationMapping() {
        //todo: so.humidityControl->ei.executedHumidityControl
        double executedHumi = 0.0;
        Random random = new Random();
        if(random.nextFloat() < failureRate);   //execution failure
        else{
            if(SO.getHumidityControl() != null){
                executedHumi = SO.getHumidityControl();  //accurate execution
                executedHumi = (executedHumi + (random.nextFloat() * noiseBoundary)) - (noiseBoundary / 2); //inaccurate execution
            }
        }
        EI.setExecutedHumidityControl(executedHumi);
    }
}