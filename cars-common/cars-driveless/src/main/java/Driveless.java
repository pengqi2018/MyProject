
public interface Driveless {
	
	void turn();
	void move(int flag) throws BoundaryException;
	void showLocation();

}
