import java.util.Scanner;
public class arrays {
    

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        int[]Name = new int[size];
        for (int i=0 ;i<size;++i){
            System.out.println("Enter value ");
            Name[i] = sc.nextInt(); 
            sum += i;
        }
        System.out.println("Sum:" + sum);
        System.out.println("Avg: " + ((float)sum/(float)size));
        sc.close();


    }
}
// write a java program to input an array?
    

