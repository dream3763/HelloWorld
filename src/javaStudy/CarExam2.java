package javaStudy;

public class CarExam2 {

	public static void main(String[] args) {
		Car car1 = new Car("소방차");
		Car car2 = new Car("구급차");		
		
		Car car3 = new Car("택시", 111);
		
		Car car4 = new Car();
		
		System.out.println(car2.name);
		System.out.println(car3.name);
		System.out.println(car4.name);
		

	}

}
