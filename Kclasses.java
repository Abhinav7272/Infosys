// java will create seperate java file for every class  
// we can access values of each other based on access specifier. 


public class Kclasses {
    public static void main( String args[]){
        KKclass1 c1 = new KKclass1() ;
        KKclass2 c2 = new KKclass2() ; 
        System.out.print(c1.a);
        System.out.print(c2.b);
    }
    
}
