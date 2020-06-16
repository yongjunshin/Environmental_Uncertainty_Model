package traffic;

public enum Signal {
    RED("0"),
    GREEN("1");
    String signalName;

    Signal(String sigName) {
        signalName = sigName;
    }

    @Override
    public String toString() {
        return signalName;
    }
}
