import java.util.Scanner;
public class ifelse {
  
   
   static public class vote {

        static void method(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your age: ");
            int age = scanner.nextInt();
            if (age>18){
            System.out.println("You are eligible to vote");
            
            }else {
            System.out.println("you are not eligible to vote");
            }
            scanner.close();
                }
        
    }
    

   public static void main(String[] args) {
    //  vote foo = new vote();
    //  foo.method();
     vote.method();
     
     

   }
}








