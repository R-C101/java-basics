public class variables {
   static class Exam{
    static int a = 1; //static variable
    int data = 99; //instance variable
    void method(){
        int b = 90;
        System.out.println(b); //local variable
    }
}
public static void main(String[] args) {
    Exam bc= new Exam();
    bc.method();
    System.out.println(Exam.a);
    System.out.println(bc.data);
    


    
}
}
