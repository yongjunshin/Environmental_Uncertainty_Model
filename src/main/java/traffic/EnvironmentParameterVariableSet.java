package traffic;

public class EnvironmentParameterVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private int[] inflowNumCars = new int[16];

    public EnvironmentParameterVariableSet() {
        for(int i = 0; i < inflowNumCars.length; i++){
            inflowNumCars[i] = 0;
        }
    }

    public EnvironmentParameterVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentParameterVariableSet)super.clone();
    }

    public int[] getInflowNumCars() {
        return inflowNumCars;
    }

    public void setInflowNumCars(int[] inflowNumCars) {
        this.inflowNumCars = inflowNumCars;
    }

    public int getInflowNumCarsSrc2Dest(int src, int dest) {
        return inflowNumCars[src * 4 + dest];
    }

    public void setInflowNumCarsSrc2Dest(int src, int dest, int setNum) {
        this.inflowNumCars[src * 4 + dest] = setNum;
    }
}
