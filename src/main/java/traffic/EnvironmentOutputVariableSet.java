package traffic;

public class EnvironmentOutputVariableSet implements Cloneable {
    //todo: define variables and getters/setters, and initialize the variables
    private int numCarAtoB;
    private int numCarAtoC;
    private int numCarAtoD;

    private int numCarBtoA;
    private int numCarBtoC;
    private int numCarBtoD;

    private int numCarCtoA;
    private int numCarCtoB;
    private int numCarCtoD;

    private int numCarDtoA;
    private int numCarDtoB;
    private int numCarDtoC;

    public EnvironmentOutputVariableSet() {
        this.numCarAtoB = 0;
        this.numCarAtoC = 0;
        this.numCarAtoD = 0;

        this.numCarBtoA = 0;
        this.numCarBtoC = 0;
        this.numCarBtoD = 0;

        this.numCarCtoA = 0;
        this.numCarCtoB = 0;
        this.numCarCtoD = 0;

        this.numCarDtoA = 0;
        this.numCarDtoB = 0;
        this.numCarDtoC = 0;
    }

    public int getNumCarAtoB() {
        return numCarAtoB;
    }

    public void setNumCarAtoB(int numCarAtoB) {
        this.numCarAtoB = numCarAtoB;
    }

    public int getNumCarAtoC() {
        return numCarAtoC;
    }

    public void setNumCarAtoC(int numCarAtoC) {
        this.numCarAtoC = numCarAtoC;
    }

    public int getNumCarAtoD() {
        return numCarAtoD;
    }

    public void setNumCarAtoD(int numCarAtoD) {
        this.numCarAtoD = numCarAtoD;
    }

    public int getNumCarBtoA() {
        return numCarBtoA;
    }

    public void setNumCarBtoA(int numCarBtoA) {
        this.numCarBtoA = numCarBtoA;
    }

    public int getNumCarBtoC() {
        return numCarBtoC;
    }

    public void setNumCarBtoC(int numCarBtoC) {
        this.numCarBtoC = numCarBtoC;
    }

    public int getNumCarBtoD() {
        return numCarBtoD;
    }

    public void setNumCarBtoD(int numCarBtoD) {
        this.numCarBtoD = numCarBtoD;
    }

    public int getNumCarCtoA() {
        return numCarCtoA;
    }

    public void setNumCarCtoA(int numCarCtoA) {
        this.numCarCtoA = numCarCtoA;
    }

    public int getNumCarCtoB() {
        return numCarCtoB;
    }

    public void setNumCarCtoB(int numCarCtoB) {
        this.numCarCtoB = numCarCtoB;
    }

    public int getNumCarCtoD() {
        return numCarCtoD;
    }

    public void setNumCarCtoD(int numCarCtoD) {
        this.numCarCtoD = numCarCtoD;
    }

    public int getNumCarDtoA() {
        return numCarDtoA;
    }

    public void setNumCarDtoA(int numCarDtoA) {
        this.numCarDtoA = numCarDtoA;
    }

    public int getNumCarDtoB() {
        return numCarDtoB;
    }

    public void setNumCarDtoB(int numCarDtoB) {
        this.numCarDtoB = numCarDtoB;
    }

    public int getNumCarDtoC() {
        return numCarDtoC;
    }

    public void setNumCarDtoC(int numCarDtoC) {
        this.numCarDtoC = numCarDtoC;
    }

    public EnvironmentOutputVariableSet clone() throws CloneNotSupportedException {
        return (EnvironmentOutputVariableSet)super.clone();
    }
}
