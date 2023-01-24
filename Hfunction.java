public class Hfunction {
    public static void main( String args[]) {
           // all functions should be in same class main in. 
           // static method calls static methods only. 
           int c = cal(2,3); 
           System.out.println( c ) ; 

           // class reference 
           Hfunction hf = new Hfunction() ; 
           System.out.println(hf.calm(4 , 5) ); // Now no need to make function static 
    }
    static int cal ( int a , int b ){
        return a+b;
    }
    int calm( int a , int b ) {
        return a * b ; 
    }                                   // METHOD OVERLOADING
    int calm( int a ){
        return a*a;
    }
}

// java is top-down language 
// c++ is buttom up langauge 

