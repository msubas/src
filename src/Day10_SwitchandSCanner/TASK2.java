package Day10_SwitchandSCanner;

public class TASK2 {
    public static void main(String[] args) {
        int num = 3;
        String result = "";
        String result2 = " ";


        result2 = (num == 1) ? "Monday" : (num == 2) ? "Tue" :
                (num == 3) ? "Wed" : (num == 4) ? "Thu" : (num == 5) ? "Fri" :
                        (num == 6) ? "Sat" : (num == 7) ? "Sun" : "Invalid";
        System.out.println(result2);

        if(num>0 && num<8) {
            result2 = (num == 1) ? "Monday" : (num == 2) ? "Tue" :
                    (num == 3) ? "Wed" : (num == 4) ? "Thu" : (num == 5) ? "Fri" :
                            (num == 6) ? "Sat" : "Sun";
        }
        else {result2="invailed";}

        System.out.println(result2);

        }

    }
