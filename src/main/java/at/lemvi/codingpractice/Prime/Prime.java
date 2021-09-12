package at.lemvi.codingpractice.Prime;

import java.math.BigInteger;

public class Prime {
    public static boolean isPrime(int num) {
        return num > 1 && BigInteger.valueOf(num).isProbablePrime(1);
    }
}

        /*
        if(num<2)
            return false;
        if(num%2==0 && num!=2)
            return false;
        if(num%3==0 && num!=3)
            return false;
        if(num%5==0 && num!=5)
            return false;
        if(num%7==0 && num!=7)
            return false;
        if(num%11==0 && num!=11)
            return false;
        if(num%13==0 && num!=13)
            return false;
        if(num%17==0 && num!=17)
            return false;
        if(num%19==0 && num!=19)
            return false;
        if(num%23==0 && num!=23)
            return false;
        if(num%61==0 && num!=61)
                return false;

        for (int i = 29; i <= Math.sqrt(num); i+=2) {
            while(i%3==0||i%5==0||i%7==0||i%11==0)
                i+=2;
            if (num%i==0 && num!=i)
                return false;



        }
        System.out.println("Prime Number found! " + num);
        return true;

         */





//        if(num%41==0 && num!=41)
//            return false;
//        if(num%73==0 && num!=73)
//            return false;
//        if(num%5099==0 && num!=5099)
//            return false;
//        return true;





//        System.out.print(i%2);
//        System.out.print(" (" + i + (i%2!=0) + "), ");
//        System.out.print(i%3);
//        System.out.print(" (" + i + (i%3!=0) + "), ");
//        System.out.print(i%5);
//        System.out.print(" (" + i + (i%5!=0) + "), ");
//        System.out.print(i%7);
//        System.out.print(" (" + i + (i%7!=0) + "), ");
//        System.out.print(i%11);
//        System.out.print(" (" + i + (i%11!=0) + "), ");
//        System.out.print(i%13);
//        System.out.println(" (" + i + (i%3!=0) + ")");
//        if(i>1)
//            if (i%2!=0||i==2)
//                if (i%3!=0||i==3)
//                    if (i%5!=0||i==5)
//                        if (i%7!=0||i==7)
//                            if (i%11!=0||i==11)
//                                return true;
//                            else
//                                return false;
//                        else
//                            return false;
//                    else
//                        return false;
//                else
//                    return false;
//            else
//                return false;
////            return (i%2!=0 || i%3!=0 || i%5!=0 || i%7!=0 || i%11!=0 || i%13!=0);
//        else
//            return false;
