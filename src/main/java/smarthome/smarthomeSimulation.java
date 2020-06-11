package smarthome;

import abstractModel.Relation;
import javafx.util.Pair;
import util.FileManager;

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

    private static ArrayList<Double> outdoorTemperature;
    private static ArrayList<Double> outdoorHumidity;

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
            updateEnvironmentParameter(simTime);
            logs.add(new Log(simTime, EP.clone(), EO.clone(), SI.clone(), SO.clone(), EI.clone()));
        }
    }

    private void updateEnvironmentParameter(int t) {
        //todo
        if (outdoorTemperature == null || outdoorHumidity == null){
            ArrayList<Pair<String, String>> config = FileManager.readConfiguration("src/main/resources/smarthome/2018 WED.txt");

            if(outdoorTemperature == null){
                outdoorTemperature = FileManager.stringToDoubleList(FileManager.getValueFromConfigDictionary(config, "temperature"));
            }
            if(outdoorHumidity == null){
                outdoorHumidity = FileManager.stringToDoubleList(FileManager.getValueFromConfigDictionary(config, "humidity"));
            }
        }

        EP.setOutdoorTemperature(outdoorTemperature.get(t-1));
        EP.setOutdoorHumidity(outdoorHumidity.get(t-1));
    }
}
