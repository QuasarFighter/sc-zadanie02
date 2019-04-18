package pl.pz;

import lombok.Builder;

@Builder
public class SimpleClass {
    private int x;
    private int y;
    private int z;

    @Override
    public String toString() {
        return "SimpleClass{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
