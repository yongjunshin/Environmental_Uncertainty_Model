package boeing;

public enum NoseControl {
    UP("1"),
    STAY("0"),
    DOWN("-1");

    String controlName;

    NoseControl(String cntName) {
        controlName = cntName;
    }

    @Override
    public String toString() {
        return controlName;
    }
}
