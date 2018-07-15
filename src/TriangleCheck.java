public class TriangleCheck {
    public boolean isRight(Triangle triangle1){
        boolean result = (triangle1.getSideA() * triangle1.getSideA()) + (triangle1.getSideB() * triangle1.getSideB()) == triangle1.getSideC() * triangle1.getSideC();
        return result;
    }
}
