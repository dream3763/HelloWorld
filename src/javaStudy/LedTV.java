package javaStudy;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("�Ѵ�");

	}

	@Override
	public void turnOff() {
		System.out.println("����");

	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("������ ���̴�.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("ä���� �ٲٴ�");

	}
	
	public void test() {
		System.out.println("�׽�Ʈ �ϴ�");
	}

}
