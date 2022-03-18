public class TrafficLight implements ITrafficLight {
	private int light;

	public TrafficLight() {
		light = 0;
	}

	public void Go_To_Next() {
		light = (light + 1) % 3;
	}

	public Boolean Is_Red() {
		return light == 0;
	}

	public Boolean Is_Green() {
		return light == 2;
	}

	public Boolean Is_Yellow() {
		return light == 1;
	}

	public String Print_Status() {
		String lightStr = "";
		if (Is_Red()) {
			lightStr = "Red";
		}

		else if (Is_Yellow()) {
			lightStr = "Yellow";
		}

		else if (Is_Green()) {
			lightStr = "Green";
		}

		return lightStr;
	}

	public ITrafficLight copy() {
		ITrafficLight newLight = new TrafficLight();

		if (Is_Yellow()) {
			newLight.Go_To_Next();
		}
		else if (Is_Green()) {
			newLight.Go_To_Next();
			newLight.Go_To_Next();
		}
		return newLight;
	}
}
