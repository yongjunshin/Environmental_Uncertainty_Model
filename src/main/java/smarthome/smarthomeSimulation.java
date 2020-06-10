package smarthome;

import java.util.ArrayList;

public class smarthomeSimulation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;
    private System S;
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;
    private Environment E;
    private ArrayList<Relation> MR;
    private ArrayList<Relation> ER;

    public smarthomeSimulation(){
        initModel();
    }

    private void initModel() {
        //todo: init model
        SI = new SystemInputVariableSet();
        SO = new SystemOutputVariableSet();
        S = new System(SI, SO);
        EI = new EnvironmentInputVariableSet();
        EP = new EnvironmentParameterVariableSet();
        EO = new EnvironmentOutputVariableSet();
        E = new Environment(EI, EP, EO);

        MR = new ArrayList<Relation>();
        MR.add(new TemperatureMonitoringRelation(EO, SI));
        MR.add(new HumidityMonitoringRelation(EO, SI));

        ER = new ArrayList<Relation>();
        ER.add(new TemperatureControlExecutionRelation(SO, EI));
        ER.add(new HumidityControlExecutionRelation(SO, EI));
    }

    public void executeSimulation(int simEndTime) throws CloneNotSupportedException {
        ArrayList<Log> logs = new ArrayList<Log>();
        int simTime = 0;
        while(simTime < simEndTime){
            simTime += 1;
            E.relationMapping();
            for(Relation r:MR){
                r.relationMapping();
            }
            S.relationMapping();
            for(Relation r:ER){
                r.relationMapping();
            }
            updateEnvironmentParameter();
            logs.add(new Log(simTime, EP.clone(), EO.clone(), SI.clone(), SO.clone(), EI.clone()));
        }
    }

    private void updateEnvironmentParameter() {
        //todo
        EP.setOutdoorTemperature(EP.getOutdoorTemperature() + 1);
        EP.setOutdoorHumidity(EP.getOutdoorHumidity() - 1);
    }
}
