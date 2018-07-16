public class TriangleCheck {
    public boolean isRightTriangle(Triangle triangle1){
        boolean result = (triangle1.getSideA() * triangle1.getSideA()) + (triangle1.getSideB() * triangle1.getSideB()) == triangle1.getSideC() * triangle1.getSideC();
        return result;
    }
}
