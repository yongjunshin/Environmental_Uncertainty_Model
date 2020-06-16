package boeing;

public class Log {
    private int time;
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;

    public Log(int time, EnvironmentOutputVariableSet EO, SystemInputVariableSet SI, SystemOutputVariableSet SO, EnvironmentInputVariableSet EI, EnvironmentParameterVariableSet EP) {
        this.time = time;
        this.EO = EO;
        this.SI = SI;
        this.SO = SO;
        this.EI = EI;
        this.EP = EP;
    }

    public int getTime() {
        return time;
    }

    public EnvironmentOutputVariableSet getEO() {
        return EO;
    }

    public SystemInputVariableSet getSI() {
        return SI;
    }

    public SystemOutputVariableSet getSO() {
        return SO;
    }

    public EnvironmentInputVariableSet getEI() {
        return EI;
    }

    public EnvironmentParameterVariableSet getEP() {
        return EP;
    }
}
