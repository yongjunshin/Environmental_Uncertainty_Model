package smarthome;

import abstractModel.Relation;

public class HumidityControlExecutionRelation extends Relation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    public HumidityControlExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei) {
        SO = so;
        EI = ei;
    }

    public void relationMapping() {
        //todo: so.humidityControl->ei.executedHumidityControl
        EI.setExecutedHumidityControl(SO.getHumidityControl());
    }
}