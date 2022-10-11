package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Phone name = htc");
	}
	private void phoneMieiNum() {
		System.out.println("Phone miei num = 12345789");

	}
	private void camera() {
		System.out.println("camera = 12mp");
	}
private void storage() {
	System.out.println("Storage = 128gb");
}
private void osName() {
	System.out.println("os name = android");

}

public static void main(String[] args) {
	PhoneInfo p = new PhoneInfo();
	p.phoneName();
	p.phoneMieiNum();
	p.camera();
	p.storage();
	p.osName();
	}
}
