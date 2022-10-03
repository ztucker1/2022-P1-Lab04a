// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonth   = numYears * 12;
        double monRate    = (annualRate / 100) / 12;
        double numerator  = monRate * Math.pow(1+ monRate, numMonth);
        double denominator= Math.pow(1+monRate, numMonth) - 1;
        double fin        = (numerator/denominator);
        double monPay     = fin * 250000;
        double totPay     = monPay * numMonth;
        double totInt     = totPay - principal;
        monPay= (int)(monPay*100);
        monPay /= 100;

        totPay = (int)(totPay*100);
        totPay /= 100;

        totInt = (int)(totInt*100);
        totInt /= 10;

        System.out.println("Principal:          $" + principal);
        System.out.println("Annual Rate:        " + annualRate + "%");
        System.out.println("Number of Years:    " + numYears);
        System.out.println("Monthly Payment:    $" + monPay);
        System.out.println("Total Payments:     $" + totPay);
        System.out.println("Total Interest:     $" + totInt);






    }
}

