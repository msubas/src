package day08_ELSEif;

public class SwitchPracticeII {
    public static void main(String[] args) {

        int dayN=4;


        switch (dayN){
            case 1:
                System.out.println("Today is Monday.You have a Java class");
                break;
                case 2:
                System.out.println("Today is Tuesday.You have a Java class");
                    break;
                case 3:
                System.out.println("Today is Wednesday.You have a SQL class");
                    break;
            case 4:
                System.out.println("Thusday Selenium");
                break;
                case 5:
                System.out.println("Friday Selenium");
                    break;
                    case 6:
                System.out.println("Saturday SQL");
                        break;
                default:
                System.out.println("Day off");
                break;
        }

    }


}
