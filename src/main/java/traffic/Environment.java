package traffic;

import abstractModel.Relation;

public class Environment extends Relation {
    private EnvironmentInputVariableSet EI;
    private EnvironmentParameterVariableSet EP;
    private EnvironmentOutputVariableSet EO;

    public Environment(EnvironmentInputVariableSet ei, EnvironmentParameterVariableSet ep, EnvironmentOutputVariableSet eo) {
        EI = ei;
        EP = ep;
        EO = eo;
    }

    public void relationMapping() {
        //todo: value assign to EO depending on value of EI and EP
        int[] prevNumCars = EO.getNumCars();
        Signal[] curExecutedSignal = EI.getExecutedSignals();
        int[] curInflowNumCar = EP.getInflowNumCars();

        for(int i = 0; i < prevNumCars.length; i++){
            int curNumCar = prevNumCars[i];
            if (curExecutedSignal[i] == Signal.GREEN){
                curNumCar = curNumCar - 10;
                if(curNumCar < 0){
                    curNumCar = 0;
                }
            }
            curNumCar = curNumCar + curInflowNumCar[i];

            int src = i / 4;
            int dest = i % 4;
            EO.setNumCarsSrc2Dest(src, dest, curNumCar);
        }
    }
}
