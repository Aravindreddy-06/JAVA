// Class 1
// Helper class
class Helper {

    // Method with 2 integer parameters
    int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }
    // With same name but with 2 double parameters
    double Multiply(double a, double b)
    {
        return a * b;
    }
}

class OverLoadingWithoutStatic {
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        Helper h = new Helper();
        System.out.println(h.Multiply(2, 4));
        System.out.println(h.Multiply(5.5, 6.3));
    }
}
