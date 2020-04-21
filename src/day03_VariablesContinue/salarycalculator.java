package day03_VariablesContinue;

public class salarycalculator {

public static void main(String[] args) {


    double Hourlyrate=55;
    double stateTaxrate = 0.04;
    double federalTaxRate=0.22;
    byte weeklyHours= 40;
    byte totalweeks=52;
    double salary=Hourlyrate*weeklyHours*totalweeks;
    double stateTax=salary*stateTaxrate;
    double federaltax=salary*federalTaxRate;
    double totaltax= stateTax+federaltax;
    double incomeaftertax= salary-(stateTax+federaltax);
    System.out.println("your salary is:$ "+ salary
             +  "  your total tax:$ "+  totaltax
             + "  income after tax:$ " +incomeaftertax);



}
}
/*
    if:
    rate = 55;
    stateTax = 0.04;
    federalTax =0.22;
    weeklyHours = 40;
    then output will be:
    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD
*/

/*
                    rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
 */