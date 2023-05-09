class BoxVolumec {
    double width, height, depth;

    BoxVolumec(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    BoxVolumec(double a){
        width=height=depth=a;
    }
    double volume(){
        return width*height*depth;
    }
}
public class BoxVolume
{
    public static void main(String args[])

    {
        BoxVolumec mybox1 = new BoxVolumec(10, 20, 30);

        BoxVolumec mycube = new BoxVolumec(4);
        double vol;
        vol = mybox1.volume();
        System.out.println(" Volume of mybox1 is " + vol);
        vol = mycube.volume();
        System.out.println(" Volume of cube is " + vol);

    }
}
