package automatedtesting;

public class TriangleClassification {
    String fail = "This is not triangle";
    String triangle = "This is triangle";
    String isoscelesTriangle = "This is isosceles triangle";
    String equilateralTriangle = "This is equilateral triangle";

    public String checkTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return fail;
        } else {
            if ((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)) {
                if (side1 == side2 || side1 == side3 || side2 == side3) {
                    if (side1 == side2 && side1 == side3) {
                        return equilateralTriangle;
                    } else {
                        return isoscelesTriangle;
                    }
                } else {
                    return triangle;
                }
            } else {
                return fail;
            }
        }
    }

}


