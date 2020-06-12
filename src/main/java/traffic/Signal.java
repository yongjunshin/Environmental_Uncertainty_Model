package traffic;

public enum Signal {
    RED(false),
    GREEN(true);
    boolean value;

    Signal(boolean b) {
        value = b;
    }
}
