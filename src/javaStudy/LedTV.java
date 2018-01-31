package javaStudy;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("켜다");

	}

	@Override
	public void turnOff() {
		System.out.println("끄다");

	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨을 높이다.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("채널을 바꾸다");

	}
	
	public void test() {
		System.out.println("테스트 하다");
	}

}
