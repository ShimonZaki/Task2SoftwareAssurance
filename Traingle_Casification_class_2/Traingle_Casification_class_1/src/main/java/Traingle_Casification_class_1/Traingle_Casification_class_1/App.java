package Traingle_Casification_class_1.Traingle_Casification_class_1; 

enum Triangle_Types {
    equilateral,
    isosceles,
    Scalene,
    Nottriangle,
    ERROR
}

class TriangleClassifier {
    
    private static Triangle_Types triangle;
    
    public static void classifyTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            triangle = Triangle_Types.Nottriangle;
        } else if (isEquilateral(a, b, c)) {
            triangle = Triangle_Types.equilateral;
        } else if (isIsosceles(a, b, c)) {
            triangle = Triangle_Types.isosceles;
        } else {
            triangle = Triangle_Types.Scalene;
        }//we change it to a logical and right order
    }

    private static boolean isTriangle(int a, int b, int c) {
        // Check if the sum of any two sides is greater than the third
        return a + b > c && a + c > b && b + c > a;//mistake b+b
    }

    private static boolean isIsosceles(int a, int b, int c) {
        // An isosceles triangle has at least two equal sides
        return (a == b && a + b > c) || (a == c && a + c > b) || (b == c && b + c > a); //mistake, we fix all the line 
    }

    private static boolean isEquilateral(int a, int b, int c) {
        // An equilateral triangle has all sides equal
        return a == b && b == c; //mistake a==a and or instead and, its shorter like this
    }
   
    public static Triangle_Types get_type() {
        return triangle;
    }
}