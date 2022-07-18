import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

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
    public void testGetClassNumber() {
        if (this.getClassNumber > 45) {
            System.out.println("Getclassnumber>45");

        } else {
            System.out.println("False");
        }
    }

    @Test
    public void testGetClassString() {
        if (this.getClassString.contains("Hello") == true) {
            System.out.println("Its contains hello");
        }
            else if (this.getClassString.toLowerCase ().contains("vello")==true) {
                System.out.println("Its contains hello");
        }
              else   {

            Assert.fail("Its no contains hello");

        }
    }
}


