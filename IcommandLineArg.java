import java.lang.*;
public class IcommandLineArg {
    public static void main( String args[]){
          // Save -------- file with .java
          // Compile ------- javac abc.java
          // Run ------- Java test arg1 arg2 arg3 arg4  ------------- 4 strings will strore args[] 
        
          for( String s : args){
            if( s.matches("[0-9\\.]+")) {  // checking input string with regex
                s = s+Double.parseDouble(s) ; 
            }
            System.out.println(s);
          }
    }
}
