public record Square(Double side) implements GeometricForm{

    @Override
    public double getArea() {
       return side * side;
    }

}
