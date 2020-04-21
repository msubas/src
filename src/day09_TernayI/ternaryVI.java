package day09_TernayI;

public class ternaryVI {
    public static void main(String[] args) {
        int grade=82;
        String stgrade=(grade>=90&&grade<=100) ?
                "Excellent" : (grade>=80&&grade<90)?
                "Great":
                (grade>=70&&grade<80)? "Good" :
                        (grade>=60&&grade<70)? "Pass" :
                        (grade>=0&&grade<60)? "failed" :
                                "Invalid Enrty";
        System.out.println(stgrade);
    }
}
