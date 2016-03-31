/**
 * The BahnCard class for Inlab 5.
 * Will test variables for TestProgram with if statements
 * @Ian Hecker
 * @version February 18, 2016
 **/
public class BahnCard
{
    private int desiredClass, age;
    private boolean isStudent;
    private int bahnCard25Price, bahnCard50Price, bahnCard100Price;

    public void setAge (int age)
    {
        this.age = age;
    }
    
    public void setStudent (boolean flag)
    {
        this.isStudent = flag;
    }
    
    public int bahnCard25Price (int desiredClass)
    {
        if (desiredClass == 1)
        {
            bahnCard25Price = 110;
        }
        else if (desiredClass == 2)
        {
            if (age < 19)
            {
                bahnCard25Price = 10;
            }
            else
            {
                bahnCard25Price = 55;
            }
        }
        return bahnCard25Price;
    }
    
    public int bahnCard50Price (int desiredClass)
    {
        if (desiredClass == 1)
        {
            if (age <= 17 || age >=60 || (age < 27 && isStudent == true))
            {
                bahnCard50Price = 220;
            }
            else
            {
                bahnCard50Price = 440;
            }
        }
        else if (desiredClass == 2)
        {
            if (age <= 17 || age >=60 || (age < 27 && isStudent == true))
            {
                bahnCard50Price = 110;
            }
            else
            {
                bahnCard50Price = 220;
            }
        }    
        return bahnCard50Price;
    }
    
    public int bahnCard100Price (int desiredClass)
    {
        if (desiredClass == 1)
        {
            bahnCard100Price = 5900;
        }
        else if (desiredClass == 2)
        {
            bahnCard100Price = 3500;
        }
        return bahnCard100Price;
    }
}