package boeing.monRel;

import abstractModel.Relation;
import boeing.EnvironmentOutputVariableSet;
import boeing.SystemInputVariableSet;

import java.util.Random;

public class AngleOfAttackMonitoringRelation extends Relation {
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;

    private double noiseBoundary;
    private double failureRate;
    private boolean flawed;

    public AngleOfAttackMonitoringRelation(EnvironmentOutputVariableSet EO, SystemInputVariableSet SI) {
        this.EO = EO;
        this.SI = SI;

        this.noiseBoundary = 1.0;
        this.failureRate = 0.05;

        this.flawed = false;
    }

    public void relationMapping() {
        Double monitoredAngle = null;
        Random random = new Random();
        if(random.nextFloat() < failureRate);    //monitoring failure
        else{
            if(random.nextFloat() < failureRate) flawed = true;
            if(!flawed){
                monitoredAngle = EO.getAngleOfAttack();   //accurate monitoring
                monitoredAngle = (monitoredAngle + (random.nextFloat() * noiseBoundary)) - (noiseBoundary / 2);   //inaccurate monitoring
                monitoredAngle = Math.round(monitoredAngle * 100)/100.0;  //inaccurate monitoring
            }
            else{
                monitoredAngle = EO.getAngleOfAttack();   //accurate monitoring
                monitoredAngle = monitoredAngle + 20.0;   //flawed inaccurate monitoring
            }
        }
        SI.setMonitoredAngleOfAttack(monitoredAngle);
    }
}
