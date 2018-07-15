public class Test {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(5, 1, 6);
        TriangleCheck triCheck = new TriangleCheck();
        boolean isRight = triCheck.isRight(triangle1);

        if (triangle1.getSideA() >= triangle1.getSideC() || triangle1.getSideB() >= triangle1.getSideC()){
            System.out.println("Bok C powinien być bokiem najdłuższym. Zaktualizuj parametry odpowiednio");
        } else {
            System.out.println("Czy trójkąt jest prostokątny?\n" + isRight);
        }
    }
}
