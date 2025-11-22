package Model;
import Enum.Colour;

import java.util.Objects;
import java.util.UUID;

public abstract class Piece {
    private Colour colour;
    private static String name;
    private boolean captured;
    private UUID id;

    public abstract void move();

    public abstract void capture();

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Piece.name = name;
    }

    public boolean isCaptured() {
        return captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Piece piece)) return false;
        return Objects.equals(id, piece.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "colour=" + colour +
                ", captured=" + captured +
                ", id=" + id +
                '}';
    }
}
