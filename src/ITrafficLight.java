public interface ITrafficLight {
	/**
	 * Represents a light that cycles between green, yellow, and red in that order and loops to the beginning
	 * Defines: Light (N)
	 * Constrains: 0 <= Light <= 2
	 * Initialization Ensures: Light = 0
	 */

	//Primary Operations

	/**
	 * Cycles light to the next state according to the rules of a traffic light
	 * @post if #Light == 0 then Light = 1 and
	 * 		 if #Light == 1 then Light = 2 and
	 * 		 if #Light == 2 then Light = 0
	 */
	void Go_To_Next();

	/**
	 * Returns true if the light is currently red
	 * @return Is_Red = (Light == 0)
	 */
	Boolean Is_Red();

	/**
	 * Returns true if the light is currently gree
	 * @return Is_Red = (Light == 2)
	 */
	Boolean Is_Green();

	/**
	 * Returns true if the light is currently yellow
	 * @return Is_Red = (Light == 1)
	 */
	Boolean Is_Yellow();

	//Secondary Operations

	/**
	 * Returns a string containing the status of the traffic light
	 * @return if (light == 0) then Print_Status = "Red" and
	 * 		   if (light == 1) then Print_Status = "Yellow" and
	 * 		   if (light == 2) then Print_Status = "Green"
	 */
	String Print_Status();

	/**
	 * Returns a copy of the traffic light
	 * @post copy.Light = Light
	 */
	ITrafficLight copy();
}
