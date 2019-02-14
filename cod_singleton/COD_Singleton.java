package cod_singleton;
// @author emendezduran

public class COD_Singleton {
    public static void main(String[] args) {
    
    Singleton a1 = Singleton.getInstance("emilio", 1);
    Singleton a2 = Singleton.getInstance("ramon", 2);
    Singleton a3 = Singleton.getInstance("francisco", 3);
    
        
    System.out.println(a1.toString());
    System.out.println(a2.toString());
    System.out.println(a3.toString());
    
    
    //Reset valores
    Singleton a4 = Singleton.ResetInstance(null, 0, 1);
    System.out.println(a4.toString());
    
    
    
    

    }

}
