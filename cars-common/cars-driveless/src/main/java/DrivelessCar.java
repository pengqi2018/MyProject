enum Direction{
	EAST,SOUTH,WEST,NORTH
}
public class DrivelessCar extends CommonCar implements Driveless{

	static final int sizeX=10;
	static final int sizeY=10;
	
	
	private int positionX;
	private int positionY;
	private Direction orientation;


	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public Direction getOrientation() {
		return orientation;
	}

	public void setOrientation(Direction orientation) {
		this.orientation = orientation;
	}


	public void turn() {
		// TODO Auto-generated method stub
	    
		switch(orientation){
		case EAST:
			orientation=Direction.SOUTH;
			break;

		case SOUTH:
			orientation=Direction.WEST;
			break;

		case WEST:
			orientation=Direction.NORTH;
			break;
		case NORTH:
			orientation=Direction.EAST;
			break;
		}
		

	}



	public void move(int flag) throws BoundaryException{
		// TODO Auto-generated method stub
		if(flag==0){

		}
		if(flag==1){
			if(orientation==Direction.EAST){

				positionX++;
			}
			else if(orientation==Direction.WEST){

				positionX--;
			}
			else if(orientation==Direction.NORTH){

				positionY++;

			}
			else{
				positionY--;
			}

			if(flag==-1){
				if(orientation==Direction.WEST){

					positionX--;
				}
				else if(orientation==Direction.EAST){

					positionX++;
				}
				else if(orientation==Direction.SOUTH){

					positionY--;

				}
				else{
					positionY++;
				}

			}

		}
		if(positionX<1||positionX>sizeX||positionY>sizeY||positionY<1){
			
			throw new BoundaryException("Sorry, Sir, you are out of park.");
		}

	}

	public void showLocation() {
		// TODO Auto-generated method stub
		
		System.out.println("--Information of loaction");
		System.out.println("PositionX:  "+getPositionX());
		System.out.println("PositionY:  "+getPositionY());
		System.out.println("Orientation:  "+getOrientation());
		
	}
	

}
