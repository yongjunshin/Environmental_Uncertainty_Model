package traffic;

import abstractModel.Relation;

import static traffic.Signal.GREEN;
import static traffic.Signal.RED;

public class System extends Relation {
    private SystemInputVariableSet SI;
    private SystemOutputVariableSet SO;

    private Signal[][] predefinedSignalPattern = new Signal[6][];

    private int numCalled;

    public System(SystemInputVariableSet si, SystemOutputVariableSet so) {
        SI = si;
        SO = so;

        predefinedSignalPattern[0] = new Signal[]{RED, GREEN, GREEN, GREEN, RED, RED, RED, RED, GREEN, RED, RED, RED, RED, RED, RED, RED};
        predefinedSignalPattern[1] = new Signal[]{RED, GREEN, RED, GREEN, GREEN, RED, GREEN, RED, RED, RED, RED, RED, RED, RED, RED, RED};
        predefinedSignalPattern[2] = new Signal[]{RED, RED, RED, RED, GREEN, RED, GREEN, GREEN, RED, RED, RED, RED, RED, GREEN, RED, RED};
        predefinedSignalPattern[3] = new Signal[]{RED, RED, RED, RED, RED, RED, GREEN, RED, GREEN, GREEN, RED, GREEN, RED, RED, RED, RED};
        predefinedSignalPattern[4] = new Signal[]{RED, RED, RED, RED, RED, RED, RED, RED, GREEN, RED, RED, GREEN, RED, GREEN, GREEN, RED};
        predefinedSignalPattern[5] = new Signal[]{RED, RED, RED, GREEN, RED, RED, RED, RED, RED, RED, RED, RED, GREEN, GREEN, GREEN, RED};

        numCalled = 0;
    }

    public void relationMapping() {
        //todo: value assign to SO depending on value of SI
        int pickedPattern = numCalled % 6;

        SO.setPlannedSignals(predefinedSignalPattern[pickedPattern]);

        numCalled++;
    }
}
