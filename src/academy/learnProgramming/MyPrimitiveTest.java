package academy.learnProgramming;

public class MyPrimitiveTest {
    static byte b = 1;
    //    b = 1;
    static short s ;
    static int i;
    static long l ;


    static float f ;
    static double d;

    static char c;
    static boolean boo;
    static boolean abc;

    String employeeName[] = new String[1000];

    static int employeeAge[] = new int[1000];




    long mylong = 12345678909L;

    public static void main(String[] args) {

        Long a  = 12039482049820L;

        long ab = a;

        System.out.println("***********98798798weoijwofijs");
        System.out.println(a);
        System.out.println("***********oiwueroiwuroiwuroiur");




//        int number = 2_147_483_647_;

        byte myByte = 127;
        int negativeNumber = -2_147_483_648;


//        width                     minimum                         maximum
//        signed    8 bit                        -128                            +127
//        signed   16 bit                     -32 768                         +32 767
//        signed   32 bit              -2 147 483 648                  +2 147 483 647
//        signed   64 bit  -9 223 372 036 854 775 808      +9 223 372 036 854 775 807

        //long max = 123456789987; // add letter l(not good) or L
        //long another_num = _2300;
        long another_num2 = 2_300;

        float myFloat = 25.67F;
        double myDouble = 30500.46;

        {
            int strangeVar;
            {

                int secondStrangeVar;
            }
            strangeVar = 0;
        }

        System.out.println("default value of byte is "+ b);
        System.out.println("default value of short is "+ s);
        System.out.println("default value of int is "+ i);
        System.out.println("default value of long is "+ l);
        System.out.println("default value of float is "+ f);
        System.out.println("default value of double is "+ d);
        System.out.println("default value of char is "+ c);
        System.out.println("default value of boolean is "+ boo);
        System.out.println("default value of boolean is "+ abc);

//        int a = 10;

//        char ch = a;
//        char ch1 = 'ab';
//        char ch1 = '1';
        char greekOmega = '\u03A9';
        char romanNumberFifty = '\u216c';

        System.out.println(greekOmega);
        System.out.println(romanNumberFifty);


//
//        int i1; int i2;
//        int i3,i4,i5;
//        int i6, int i7;

//        System.out.println(i1);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
//        System.out.println(cars[4]);
//        System.out.println(cars[0]);

        String[] variableName = {"1","2","3","4","5","6","7"};

        int[] abc = new int[20];

        for(int i=0; i< abc.length;i++){
            abc[i]=i+1;
        }



        System.out.println("********* for loop*********");


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int [] intVariable = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < intVariable.length; i++) {
            System.out.println(cars[i]);
        }




    }
}
