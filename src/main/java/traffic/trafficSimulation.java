package traffic;

import abstractModel.Relation;
import javafx.util.Pair;
import traffic.exeRel.signalExecutionRelation;
import traffic.monRel.numCarMonitoringRelation;
import util.FileManager;

import java.util.ArrayList;

public class trafficSimulation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;
    private System S;
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;
    private Environment E;
    private ArrayList<Relation> MR;
    private ArrayList<Relation> ER;

    private ArrayList<ArrayList<Integer>> trafficInflow;

    public trafficSimulation(){
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
        for (int src = 0; src < 4; src++){
            for (int dest = 0; dest < 4; dest++){
                MR.add(new numCarMonitoringRelation(EO, SI, 2, 0.01, src, dest));
            }
        }

        ER = new ArrayList<Relation>();
        for (int src = 0; src < 4; src++) {
            for (int dest = 0; dest < 4; dest++) {
                ER.add(new signalExecutionRelation(SO, EI, 0.01, src, dest));
            }
        }
    }

    public ArrayList<Log> executeSimulation(int simEndTime) throws CloneNotSupportedException {
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
            logs.add(new Log(simTime, EO.clone(), SI.clone(), SO.clone(), EI.clone(), EP.clone()));
        }
        return logs;
    }

    private void updateEnvironmentParameter(int t) {
        //todo
        if(trafficInflow == null){
            trafficInflow = FileManager.readIntegerCSV("src/main/resources/traffic/inflow.csv");
        }

        ArrayList<Integer> curInflow = trafficInflow.get(t-1);
        int[] curInflowArray = new int[16];
        for (int i=0; i<curInflow.size(); i++){
            curInflowArray[i] = curInflow.get(i);
        }

        EP.setInflowNumCars(curInflowArray);
    }
}
