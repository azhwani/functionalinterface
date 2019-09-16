
@FunctionalInterface  
interface hellofy{  
    void hello(String msg);  
}  

public class FunctionalInterfaceImpl implements hellofy{  
    public void hello(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceImpl fie = new FunctionalInterfaceImpl();  
        fie.hello("Hello There!");  
    }  
}  
