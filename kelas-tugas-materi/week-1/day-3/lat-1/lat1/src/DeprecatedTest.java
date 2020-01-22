/**
 * <p>Ini adalah contoh javadoc untuk file DeprecatedTest.java. File ini adalah turunan dari SuperBase.java</p>
 * @author Jojo
 * @version 1.0
 */

public class DeprecatedTest extends SuperBase
{
    //@Deprecated
    @Override
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
    
    @SuppressWarnings("deprecation")
    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
        SuperBase d2= new SuperBase();
        d2.Display();
    }
}