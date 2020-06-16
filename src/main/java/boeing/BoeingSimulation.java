package boeing;

import abstractModel.Relation;
import boeing.exeRel.NoseControlExecutionRelation;
import boeing.monRel.AngleOfAttackMonitoringRelation;

import java.util.ArrayList;

public class BoeingSimulation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;
    private System S;
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;
    private Environment E;
    private ArrayList<Relation> MR;
    private ArrayList<Relation> ER;

    public BoeingSimulation(){
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
        MR.add(new AngleOfAttackMonitoringRelation(EO, SI));

        ER = new ArrayList<Relation>();
        ER.add(new NoseControlExecutionRelation(SO, EI));
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

    }
}
