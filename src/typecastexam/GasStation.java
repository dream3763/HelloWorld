package typecastexam;

public class GasStation {

	public static void main(String[] args) {
		Truck truck = new Truck();
		Suv suv = new Suv();
		GasStation gasStation = new GasStation();
		
		gasStation.fill(truck);
		gasStation.fill(suv);;
		
		// TODO Auto-generated method stub

	}
	
	public void fill(Car car) {
		System.out.println(car.getClass().getName() + " �����մϴ�");
		car.gas = 10;
		System.out.println(car.gas + " ���� �߽��ϴ�");
	}

}
