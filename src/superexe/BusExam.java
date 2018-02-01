package superexe;

public class BusExam {

	public static void main(String[] args) {
		Car car = new Bus();
		
		car.run();
		
		Bus bus= (Bus)car;
		bus.run();
		bus.ppang();
		

	}

}
