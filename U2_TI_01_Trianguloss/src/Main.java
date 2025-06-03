
import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.IsoscelesTriangle;
import Model.EquilateralTriangle;
import Model.ScaleneTriangle;

public class Main {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs isoscelesTri = new IsoscelesTriangle(4,5,6);
        FigureAbs equilateralTri = new EquilateralTriangle(5);
        FigureAbs scaleneTri = new ScaleneTriangle(8, 6, 5);

        FigureAbs[] figures = { sq, cir, triangle, isoscelesTri, equilateralTri, scaleneTri};

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}