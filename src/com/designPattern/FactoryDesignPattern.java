package com.designPattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {

		MobileFactory factory = new MobileFactory(4);

		Mobile mobile = factory.getMobile();

		mobile.showMobile();
	}

}

interface Mobile {

	public void showMobile();
}

class Android implements Mobile {

	@Override
	public void showMobile() {
		System.out.println("Android mobile show called..");
	}

}

class IOS implements Mobile {

	@Override
	public void showMobile() {
		System.out.println("IOS mobile show called...");
	}

}

class Windows implements Mobile {

	@Override
	public void showMobile() {
		System.out.println("Windows mobile show called..");
	}

}

class MobileFactory {

	Mobile mobile;

	public MobileFactory(int id) {
		if (id == 1) {
			this.mobile = new Android();
		} else if (id == 2) {
			this.mobile = new Windows();
		} else {
			this.mobile = new IOS();
		}
	}

	public Mobile getMobile() {
		return mobile;
	}

}