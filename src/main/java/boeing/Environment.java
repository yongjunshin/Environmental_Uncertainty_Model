package boeing;

import abstractModel.Relation;

public class Environment extends Relation {
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;

    public Environment(EnvironmentInputVariableSet ei, EnvironmentParameterVariableSet ep, EnvironmentOutputVariableSet eo) {
        this.EI = ei;
        this.EP = ep;
        this.EO = eo;
    }

    public void relationMapping() {
        EO.setAngleOfAttack(EO.getAngleOfAttack() + EI.getExecutedNoseControl());
    }
}
