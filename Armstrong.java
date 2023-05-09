import java.util.Scanner;
public class Armstrong {
    public int armstrong(int n){
        int num=n,cubeSum=0;
        while(num>0){
            int digit=num%10;
            cubeSum+=(digit*digit*digit);
            num=num/10;
        }
        if(cubeSum==n)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        Armstrong obj=new Armstrong();
        int r=obj.armstrong(num);
        if(r==1)
            System.out.println(num+"Is armstrong number");
        else
            System.out.println(num+"Is not an armstrong number");
    }
}
