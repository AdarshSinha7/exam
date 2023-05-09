public class Largest_cla {
    public static void main(String[] args) {
        int a[]=new int[10];
        int max,i;
        for(i=0;i<args.length;i++){
            a[i]=Integer.parseInt(args[i]);
        }
        max=a[0];
        for(i=1;i<args.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Largest number is="+max);
    }
}
