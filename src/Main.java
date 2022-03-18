import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<TrafficLight> lights = new Stack<TrafficLight>();

		TrafficLight light1 = new TrafficLight();
		TrafficLight light2 = (TrafficLight) light1.copy();
		TrafficLight light3 = (TrafficLight) light1.copy();

		while (!light2.Is_Yellow()) {
			light2.Go_To_Next();
		}

		while (!light3.Is_Green()) {
			light3.Go_To_Next();
		}

		lights.push(light1);
		lights.push(light2);
		lights.push(light3);
		System.out.println(lights.pop().Print_Status());

	}
}
