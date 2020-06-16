package boeing;

import abstractModel.Relation;

public class System extends Relation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;

    public System(SystemInputVariableSet si, SystemOutputVariableSet so) {
        this.SI = si;
        this.SO = so;
    }

    public void relationMapping() {
        if (SI.getMonitoredAngleOfAttack() == null);
        else if (SI.getMonitoredAngleOfAttack() > 10){
            SO.setPlannedNoseControl(NoseControl.DOWN);
        }
        else if (SI.getMonitoredAngleOfAttack() < -10){
            SO.setPlannedNoseControl(NoseControl.UP);
        }
        else{
            SO.setPlannedNoseControl(NoseControl.STAY);
        }
    }
}
