package Root_classificatin.Root_classificatin;

enum Root_Types {
    No_roots,
    Not_quadratic,
    Equal_roots,
    Two_roots,
    ERROR
}

class Roots {
    private static Root_Types roots;

    private static boolean out_of_Range(double x, double a, double b) {
        return !(x >= a && x <= b);
    }

    public static void calculate_roots(double a, double b, double c) {
        // Fix #1: Check for out-of-range values and set to ERROR if true
        if (out_of_Range(a, 0, 50) || out_of_Range(b, 0, 50) || out_of_Range(c, 0, 100)) {
            roots = Root_Types.ERROR;
            return;
        }

        // Fix #2 :'a' is 0, meaning the equation is not quadratic
        if (a == 0) {
            roots = Root_Types.Not_quadratic;
            return;
        }

        // Fix #3: changed from 'b*b - 2*a*c' to 'b*b - 4*a*c')
        double discriminant = b * b - 4 * a * c;

        // Fix #4: Set root types based on the value of the discriminant
        if (discriminant > 0) {
            roots = Root_Types.Two_roots;
        } else if (discriminant == 0) {
            roots = Root_Types.Equal_roots;
        } else {
            roots = Root_Types.No_roots;
        }
    }

    public static Root_Types root_types() {
        return roots;
    }
}
