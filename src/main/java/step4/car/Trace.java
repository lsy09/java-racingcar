package step4.car;

public class Trace {
    private final String name;
    private final int position;

    public Trace(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}