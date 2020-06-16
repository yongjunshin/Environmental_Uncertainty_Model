package traffic;

public class EnvironmentOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private int[] numCars = new int[16];

    public EnvironmentOutputVariableSet() {
        for(int i=0; i < numCars.length; i++){
            numCars[i] = 0;
        }
    }

    public int[] getNumCars() {
        return numCars;
    }

    public void setNumCars(int[] numCars) {
        this.numCars = numCars;
    }

    public int getNumCarsSrc2Dest(int src, int dest) {
        return numCars[src * 4 + dest];
    }

    public void setNumCarsSrc2Dest(int src, int dest, int setNum) {
        this.numCars[src * 4 + dest] = setNum;
    }

    public EnvironmentOutputVariableSet clone() throws CloneNotSupportedException {
        EnvironmentOutputVariableSet c = (EnvironmentOutputVariableSet)super.clone();
        c.setNumCars(c.getNumCars().clone());
        return c;
    }
}
