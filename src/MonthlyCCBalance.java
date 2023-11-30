public class MonthlyCCBalance {
    public static void main(String[] args)
    {
        double creditCardBalance = 5000.00;
        double annualInterestRate = 0.17; // 17%
        double monthlyInterestRate = annualInterestRate / 12;
        double interestAfterOneMonth = creditCardBalance * monthlyInterestRate;
        System.out.println("Interest after one month: $" + interestAfterOneMonth);
        creditCardBalance += interestAfterOneMonth;
        double interestAfterTwoMonths = creditCardBalance * monthlyInterestRate;
        System.out.println("Interest after two months: $" + interestAfterTwoMonths);



    }

}
