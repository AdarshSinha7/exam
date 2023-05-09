import java.util.Scanner;
public class Pronic_Number {
    public int pronic(int n){
        int isPronic=0;
        for(int i=1;i<=n-1;i++){
            if(i*(i+1)==n){
                isPronic=1;
                break;
            }
        }
        return isPronic;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to chcek");
        int num=sc.nextInt();
        Pronic_Number obj=new Pronic_Number();
        int r=obj.pronic(num);
        if(r==1)
            System.out.println(num+"is Pronic");
        else
            System.out.println(num+"not pronic");
    }
}
