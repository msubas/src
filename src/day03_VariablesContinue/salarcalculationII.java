package day03_VariablesContinue;

public class salarcalculationII {
    public static void main(String[] args) {

    /*
    rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
     */

        double Hourlyrate = 45.25;
        double stateTaxrate = 0.045;
        double federalTaxRate = 0.25;
        byte weeklyHours = 45;
        byte totalweeks = 52;
        double salary = Hourlyrate * weeklyHours * totalweeks;
        double stateTax = salary * stateTaxrate;
        double federaltax = salary * federalTaxRate;
        double totaltax = stateTax + federaltax;
        double incomeaftertax = salary - (stateTax + federaltax);
        System.out.println("your salary is: $ " + salary);
                System.out.println("your total tax: $ " + totaltax);
        System.out.println("income after tax: $ " + incomeaftertax);
    }
}