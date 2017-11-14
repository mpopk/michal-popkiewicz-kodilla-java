package com.kodilla.testing;

        import com.kodilla.testing.calculator.SimpleCalculator;
        import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        int resultA = calculator.addAToB(2,2);
        if(resultA == 4){System.out.println("Test udany");

        }else{
            System.out.println("Test nieudany");

            int resultB = calculator.substractAFromB(2,2);
            if (resultB==0){System.out.println("Test udany");
            }else{
                System.out.println("Test nieudany");
            }
        }
    }
}
