package Wednesday;
public class officehour {
    public static void main(String[] args) {
        //+= addition assignment
        int a=100;
        a=a+200;
        System.out.println(a); // or
        a+=200; //since a is 300 above result will be 500
        System.out.println(a);
        a+=200*3; // now 500+ (200*3)==1100
        System.out.println(a);
         a-=400;
        System.out.println(a);
        a/=7;
        System.out.println(a);
        a=a%6;
        System.out.println(a);
        a+=2*5;
        System.out.println(a);
        int m=10;
                m=m%3;
        System.out.println(m);
        int x=20;
        System.out.println(x++);
        System.out.println(x);
//=====================================
        int b=30;
        int c=b++;
        System.out.println(b);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c);
//=====================================
        int d=40;
        int e=d++;
//======================================
        System.out.println(e);
        System.out.println(e);
        System.out.println(d);
        System.out.println(d);
//=======================================

        int g= 10;
        int h=++g;
        System.out.println(g);
        System.out.println(h);
     //==================================

        int z=100;

        z=z++ + --z + ++z;
        //100+100+101 =301
        System.out.println(z);
//=========================================

        int u=900;
        int r= - ++u + ++u + -u++;
        //     -901+ 900 -900 =-901
        System.out.println(r);
        System.out.println(u);





    }

}
