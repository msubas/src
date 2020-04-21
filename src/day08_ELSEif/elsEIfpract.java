package day08_ELSEif;

public class elsEIfpract {
    public static void main(String[] args) {
        byte months=15;
        String result= " ";
        if (months==1){ result="January 31 days";}
        else if (months==2){result="February 28 or 29 days";}
        else if (months==3){ result="March 31 days";}
        else if (months==4){ result="April 30 days";}
        else if (months==5) { result="May 31 days";}
        else if (months==6){ result="June 30 days";}
        else if (months==7) { result="July 31 days";}
        else if (months==8){ result="Aug 31 days";}
        else if (months==9){ result="sep 30 days";}
        else if (months==10) { result="oct 31 days";}
        else if (months==11){ result="nov 30 days";}
        else if (months==12) { result="dec 31 days";}
       else { result="invalid number";}
        System.out.println(result);
    }
}
