public class example {
	public static void main(String[] args) {
		TrafficLight origLight = new TrafficLight();
		TrafficLight newLight = origLight;

		System.out.println("Original Light: " + origLight.Print_Status());
		System.out.println("New Light: " + newLight.Print_Status());

		newLight.Go_To_Next();

		System.out.println("Should be different...");
		System.out.println("Original Light: " + origLight.Print_Status());
		System.out.println("New Light: " + newLight.Print_Status());
	}
}
