package smarthome;

public class Log {
    private int time;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;
    private EnvironmentInputVariableSet EI;

    public Log(int t, EnvironmentParameterVariableSet ep, EnvironmentOutputVariableSet eo, SystemInputVariableSet si, SystemOutputVariableSet so, EnvironmentInputVariableSet ei){
        time = t;
        EP = ep;
        EO = eo;
        SI = si;
        SO = so;
        EI = ei;
    }

    public int getTime() {
        return time;
    }

    public EnvironmentParameterVariableSet getEP() {
        return EP;
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
}
