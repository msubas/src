package Day29_Wrapper_ArrayList;

public class IV_Practice {

    public static void main(String[] args) {

        String a="123";
        byte b= Byte.parseByte(a);
        System.out.println(b); // 123
        Integer i=(int)Byte.parseByte(a); // Autoboxing we cast byte to int So wrapper class accep the variable.
       // Integer i2=(short)Byte.parseByte(a); it will give a comipile error because it is not int
        Integer i3=(int)(short)Byte.parseByte(a);// however we can convert to in like that so it will be ok.

        String str3="3147483647";
        long num =Long.parseLong(str3); // data type is long  with casting I cannot get int
        System.out.println(num);//3147483647

        double num1=Long.parseLong(str3);
        System.out.println(num1); // I can assign to double or float result will be 3147483647

        String result1="true";
        boolean b2= Boolean.parseBoolean(result1);
        System.out.println(b2); // result is true and data type is boolean
        System.out.println(!b2);//false

        String b3="Today is Moday";
        boolean b4= Boolean.parseBoolean(b3);
        System.out.println(b4); // even today is Monday since text is not true or false therefore it will be false

        String d="TrUE"; // It will ignore the case sensitivity
        boolean e= Boolean.parseBoolean(d);
        System.out.println(e);// it will be true because parse method ignores the case sensitivity




    }
}
