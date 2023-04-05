import java.util.Scanner; //for get user inputs
public class Main { //creating the main class
    static void Area() { //object for calculate area of rectangle and square (re-usability)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of the surface\t:");
        int length = in.nextInt();
        System.out.print("Enter width of the surface \t:");
        int width = in.nextInt();
        System.out.println("Area of the object\t\t\t:"+length*width+"cm\u00B2");
    }

    static void vol_CubeorCuboid(){ //object for calculate area and volume of cube or cuboid (re-usability)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of the surface\t:");
        int length = in.nextInt();
        System.out.print("Enter width of the surface\t:");
        int width = in.nextInt();
        System.out.print("Enter height of the surface\t:");
        int height = in.nextInt();
        System.out.println("Area of the object\t\t\t:"+(2*((width*length)+(length*height)+(height*width)))+"cm\u00B2");
        System.out.println("Volume of the object\t\t:"+length*width*height+"cm\u00B3");
    }

    static void vol_Cylinder(){ //object for calculate area and volume of cylinder
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of the surface\t:");
        int length = in.nextInt();
        System.out.print("Enter radius of the surface\t:");
        int radius = in.nextInt();
        System.out.print("Area of the cylinder\t\t:");
        System.out.printf("%.2f",(2*((Math.PI)*radius*length)+2*((Math.PI)*Math.pow(radius,2))));
        System.out.printf("cm\u00B3");
        System.out.println();
        System.out.print("Volume of the cylinder\t\t:");
        System.out.printf("%.2f",((Math.PI)*(Math.pow(radius,2))*length));
        System.out.println("cm\u00B3");
    }

    static void vol_Sphere(){ //object for calculate area and volume of sphere
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the sphere\t:");
        int radius = in.nextInt();
        System.out.printf("Area of the cylinder\t\t:");
        System.out.printf("%.2f",4*(Math.PI*(Math.pow(radius,2))));
        System.out.println("cm\u00B2");
        System.out.printf("Volume of the cylinder\t\t:");
        System.out.printf("%.2f",((1.333333333)*(Math.PI)*(Math.pow(radius,3))));
        System.out.print("cm\u00B3");
    }

    public static void main(String[] args) { //secondary class for interact with user
        System.out.println("____________________Select your choice____________________");
        System.out.println("\t1. Area of rectangle or square");
        System.out.println("\t2. Area and volume of cube or cuboid");
        System.out.println("\t3. Area and volume of cylinder");
        System.out.println("\t4. Area and volume of sphere");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice\t:");
        int radius = in.nextInt(); //get input for identify the user's choice

        if (radius == 1){ //call the objects
            Area();
        } else if (radius == 2) {
            vol_CubeorCuboid();
        } else if (radius == 3) {
            vol_Cylinder();
        } else if (radius == 4) {
            vol_Sphere();
        } else {
            System.out.println("Invalid input try again");
        }
    }
}