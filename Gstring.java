import java.lang.*;
public class Gstring {

    public static void main(String args[]){
    // String is a class
       String str =       "java" ; 
    // class  reference = " Object"

    // constructor of String class
    // 1. String( char[]) 
    char arr[] = {'a', 'b', 'c'} ; 
    String strc = new String(arr); // new will create string in heap 
    System.out.println(strc);

    // 2. String(byte[])
    byte b[] ={65,66,67}; // A,B,C 
    String strb = new String(b); 
    System.out.println(strb);     // str(stack)--------------->'65,66'(heap);

    //3. String(String) 
    String strs = new String("javaislong"); 
    System.out.println(strs);


    String str1="Javaisagoodlanguage" , str2="java"; 
    // str1------------>heap("java")<------------str2
    
    System.out.println(str1.length());
    System.out.println(str1.toLowerCase());
    System.out.println(str1.trim());// remove extra spaces 
    System.out.println(str1.substring(3,10)); // based on 0 indexing(begin to end-1)
    System.out.println(str1.replace('l', 'z'));
    System.out.println(str2.startsWith("java")); // true false 
    System.out.println(str2.endsWith("va")); // t f 
    System.out.println(str2.charAt(2));
    System.out.println(str2.indexOf("a", 2)); // from and after 2 
    System.out.println(str2.lastIndexOf("a"));
    //IMP : 
    System.out.println(str1.equals(str2)); // true false EXAMPLE:  str1 = "java", str2= "python", Str3="python" 
                                           // str1.euqals(str2) false, str2.equals(str3) true. 
     
    System.out.println(str1.compareTo(str2)); // 0 , -1(any negative) , 1(any postive) 
                                              // compares the given string with the current string lexicographically.

    //IMP :
    // equals VS == 
    
    String one = "java" ; 
    String two = "java" ;  // already in string pool not create new value 
    String three = new String("java") ; 

    // one -----> heap1(java)<----- two , three ----> java  (String pool)
    
    // 1. equals ----- only compare values
    System.out.println(one.equals(two)); // true 
    System.out.println(one.equals(three)); // true  
    
    // 2. == ----- compares References/ leterals
    System.out.println(one == two); // true 
    System.out.println(one == three ); // false 
    }

}
