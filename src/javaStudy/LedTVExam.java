package javaStudy;

public class LedTVExam {

	public static void main(String[] args) {
		TV ledTV = new LedTV();
		
		ledTV.turnOn();
		ledTV.changeVolume(1);
		ledTV.changeChannel(100);
		ledTV.turnOff();
		
		LedTV ledTV2 = new LedTV();
		
		ledTV2.turnOn();
		ledTV2.changeVolume(1);
		ledTV2.changeChannel(100);
		ledTV2.turnOff();
		ledTV2.test();
	}

}
