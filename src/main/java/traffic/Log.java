package traffic;


public class Log {
    private int time;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    public Log(int t, EnvironmentOutputVariableSet eo, SystemInputVariableSet si, SystemOutputVariableSet so, EnvironmentInputVariableSet ei, EnvironmentParameterVariableSet ep){
        time = t;
        EO = eo;
        SI = si;
        SO = so;
        EI = ei;
        EP = ep;
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
