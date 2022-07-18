import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();
        {
            if (a == 14) {
                System.out.println("Yes. A=14");
            } else {
                System.out.println("False");
            }
        }
    }
    @Test
    public void testGetClassNumber()  {
        if (this.getClassNumber>45)
        {
            System.out.println("Getclassnumber>45");

    }
        else {
            System.out.println("False");
        }
    }
    @Test
    public void testGetClassString () {
        boolean result;
        System.out.println(this.getClassString);
         result=this.getClassString.equalsIgnoreCase("Hello");
            System.out.println(result);
        }
        
    }

