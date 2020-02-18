package model;

public class Gamer {
    private static final int DEFAULT_ATTEMPTS_COUNT = 6;
    private int attempts;
    private String name;

    public Gamer (String name) {
        attempts = DEFAULT_ATTEMPTS_COUNT;
        this.name = name;
    }

    public Gamer(String name, int attempts) {
        this.attempts = attempts;
        this.name = name;
    }

    public void decreaseAttempts() {
        attempts -= 1;
    }

    public int getAttempts() {
        return attempts;
    }

    public String getName() {
        return name;
    }
}
