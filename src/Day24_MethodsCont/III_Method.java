package Day24_MethodsCont;

public class III_Method {

    public static void Age(int birtYear) {

        int currentyear = 2020;
        int age = currentyear - birtYear;
        if(age<0 || birtYear<1900){
            System.out.println("Invalid Entery");
        }
        else {
        System.out.println(age);}

    }

    public static void main(String[] args) {
        Age(1899);//I can find the persons age based of
                            // this birthyear
    }
}

/*
Birth year



 */