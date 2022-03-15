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
		if (light == 0) {
			lightStr = "Red";
		}

		else if (light == 1) {
			lightStr = "Yellow";
		}

		else if (light == 2) {
			lightStr = "Green";
		}

		return lightStr;
	}

	public ITrafficLight copy() {
		ITrafficLight newLight = new TrafficLight();
		((TrafficLight) newLight).light = light;
		return newLight;
	}
}
