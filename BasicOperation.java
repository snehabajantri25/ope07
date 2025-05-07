public class BasicOperation {
    public static void main(String[] args) {
        int a= 15;
        int b =0;
        try{
            int div =a/b;
            System.out.println("result:"+ div);
        }
        catch
        (ArithmeticException e){
            System.out.println("error:Division by zero is not allowed");
        }
        
    }

}
