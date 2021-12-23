package geometry;

public class Geometry {

    public static void main(String[] args) {

        int x1,x2,y1,y2,x3,x4,y3,y4;
        double length;

        x1 = 20;
        x2 = 30;
        y1 = 10;
        y2 = 20;
       

        length = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.println("The length is " + length);

    }
}
