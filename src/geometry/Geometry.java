package geometry;

public class Geometry {

    public static void main(String[] args) {

        int x1,x2,y1,y2,x3,x4,y3,y4;
        double length1,length2;

        x1 = 20;
        x2 = 30;
        y1 = 10;
        y2 = 20;
        x3 = 20;
        x4 = 30;
        y3 = 10;
        y4 = 20;

        length1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.println("The length is " + length1);

        length2 = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));

        if (length1 == length2)
        {

            System.out.println("Length is equal");
        }
        else
        {
            System.out.println("Length is not equal");

        }
    }
}
