import java.lang.* ; 
class ArchitectureOfJvm {
    public static void main ( String []args ){
        String str = new String("Sum") ; 
        System.out.println(str);

                        // JVM memory 
        /*
         * "sum" ---- heap  
         *  str , calculation -- stack 
         * print() , main() -- code section 
         */

    }
}