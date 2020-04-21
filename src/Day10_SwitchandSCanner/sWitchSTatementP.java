package Day10_SwitchandSCanner;

public class sWitchSTatementP {
    public static void main(String[] args) {
        int num=0;

        switch (2) {
            case 1:
                num += 3;
                break;
            case 2:
                num += 2;
                break;

            default:
                num -= 5;
                break;
        }
                System.out.println(num);
        }
    }

