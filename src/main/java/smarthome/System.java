package smarthome;

public class System extends Relation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;

    public System(SystemInputVariableSet si, SystemOutputVariableSet so){
        SI = si;
        SO = so;
    }

    public void relationMapping() {
        //todo: value assign to SO depending on value of SI
        SO.setTemperatureControl(0.0);
        SO.setHumidityControl(0.0);
    }
}
