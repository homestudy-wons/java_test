package add;

public class car {
		public car() {
		}
		int speed;
		int distance;
		String color;
		
		public void speedUp() {
			speed = speed +5;
		}
		public void speedDown() {
			speed = speed -10;
		}
		public int getCurrentSpeed() {
			return speed;
		}
		
		public static void main(String[] args) {
			car car = new car();
			car.speedUp();
			car.speedDown();
			System.out.println(car.getCurrentSpeed());
		}
}
