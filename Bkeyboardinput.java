import java.lang.*;
import java.util.*;
public class Bkeyboardinput {
    public static void main( String arg []){
        Scanner s =  new Scanner(System.in);
        int a , b ; 
        a = s.nextInt(); 
        b = s.nextInt();
        System.out.println(a+b);
        Integer c ; 
        c= s.nextInt(); // nextInt() , nextFloat(), nextDouble(), next(), nextLine(), nextByte(), nextShort(), nextLong(),nextBoolean(); 
        System.out.print(c);
        String d; 
        d = s.next(); // only one string terminate at " " . 
        String e;
        e = s.nextLine(); // full line of strings terminate at /n.
        System.out.println(d); 
        System.out.println(e); 
        System.out.println(e.length());  // will give you the length including /n at last ; 

        // // Danish ka senrio 
        int f ; 
        String g ; 
        f = s.nextInt(); 
        g = s.nextLine();
        System.out.println(f);
        System.out.print(g);

        // IMP : char is of 2 bytes because java support UNICODE not ASCII 

        System.out.println("Max Size : "+ Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        // Size of Data 
        /*  
        byte	1 byte	Stores whole numbers from -128 to 127 --- byte b = 130 (Not Allowed) ---byte b = 127 (Allowed) 
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	1 bit	Stores true or false values
        char	2 bytes	Stores a single character/letter or ASCII values 
        */
        int x = 5 ; 
        System.out.println(Integer.toBinaryString(x)); // binary string 101 = 5 
        System.out.println(Integer.toBinaryString(-x)); // 2s compliment form 11111-------1011 (32 byte)

        // upto 6 digit after -- float is suitable.
        // But for > 6 is required 
        
    }
}