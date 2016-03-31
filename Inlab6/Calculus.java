/**
 * Calculus class to do numerical integration.
 * 
 * @author Ian Hecker
 * @version February 26, 2016
 */
public class Calculus
{
    public static double integrate(double lowerBound, double upperBound, int numRec)
    {
        double area = 0.0, height = 0.0, rectangle;
        double base = (upperBound-lowerBound)/numRec;
        double midpoint = base/2 + lowerBound;
      
        for(int i = 0; i < numRec; i++) {
           midpoint += base;
           height = function(midpoint);
           rectangle = height*base;
           area += rectangle;
    }
        return area;
    }
    
    private static double function(double x)
    {
        return x * x;
    }
}