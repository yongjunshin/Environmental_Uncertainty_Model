package smarthome;

public class TemperatureControlExecutionRelation extends Relation {
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    public TemperatureControlExecutionRelation(SystemOutputVariableSet so, EnvironmentInputVariableSet ei){
        SO = so;
        EI = ei;
    }

    public void relationMapping() {
        //todo: so.temperatureControl->ei.executedTemperatureControl
        EI.setExecutedTemperatureControl(SO.getTemperatureControl());
    }
}
