public interface ITrafficLight {
	//Primary Operations
	void Go_To_Next();
	Boolean Is_Red();
	Boolean Is_Green();

	//Secondary Operations
	Boolean Is_Yellow();
	String Print_Status();
	ITrafficLight copy();
}
