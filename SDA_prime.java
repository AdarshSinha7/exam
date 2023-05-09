import java.util.Scanner;
public class SDA_prime {
    public static void main(String[] args) {
        int n[]=new int[20];
        int temp[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int y=sc.nextInt();
        System.out.println("Enter the number of 1d array");
        int x=0;
        for(int i=0;i<y;i++){//This is for getting the number of elements we want to deal with
            int j=0;
            n[i]=sc.nextInt();//And this is where we store the elements we want to store
            for(j=2;j<=n[i]/2;j++){//Now this is the actual program logic
                if(n[i]%j==0)//program logic
                    break;
            }
            if(n[i]>1 && j>n[i]/2)
                temp[x++]=n[i];
        }
        System.out.println("The prime number are:");
        for(int i=0;i<x;i++) {
            System.out.println(temp[i]);
        }
    }
}
