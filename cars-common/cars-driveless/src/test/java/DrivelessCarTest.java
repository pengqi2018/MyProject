import java.util.Scanner;


public class DrivelessCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrivelessCar dc=new DrivelessCar();
		Scanner scan=new Scanner(System.in).useDelimiter("\\s");

		//First ,we should innitialize the location through the console
		System.out.println("Please enter the information of car's location.");
		System.out.println("Tips: in the forms like  (x y z),\nRemembe: 0<x<=10,0<y<=10,z is among of EAST,SOUTH,WEST,NORTH:");

		dc.setPositionX(scan.nextInt());
		dc.setPositionY(scan.nextInt());
		Direction dd=Enum.valueOf(Direction.class, scan.next().trim());
		dc.setOrientation(dd);
		dc.showLocation();

		//Now let's test the driveless car
		System.out.println("Now Let's drive the car!");
		System.out.println("Here are some instructions:");
		System.out.println("enter (1 1),means moving forward, turn clockwise.");
		System.out.println("enter (1 0),means moving forward, no turning.");
		System.out.println("enter (0 0),means no moving, no turning.");
		System.out.println("enter (-1 1),means moving backward, turn clockwise.");

		while(true){

			System.out.println("Please enter the parameters of how to move and turn::");
			Scanner scan2=new Scanner(System.in).useDelimiter("\\s");
			int a1=scan2.nextInt();
			int a2=scan2.nextInt();
			try {
				if(a2==1){
					dc.move(a1);
					dc.turn();
				} 
				if(a2==0){
					dc.move(a1);
				}
			}
			catch (BoundaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				System.out.println("Your location at the present:");
				dc.showLocation();
			}
		}
	}


}


