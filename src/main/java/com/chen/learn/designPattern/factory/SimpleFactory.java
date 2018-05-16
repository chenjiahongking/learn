package com.chen.learn.designPattern.factory;

public class SimpleFactory {
	public static void main(String[] args) {
		Car car = Driver.getCar("benze");
		car.driver();
	}
}
//抽象产品类
interface Car {
	public void driver();
}
//产品实现1
class Benze implements Car {
	@Override
	public void driver() {
		System.out.println("i am benze,let's go");
	}
}
//产品实现2
class BWM implements Car {
	@Override
	public void driver() {
		System.out.println("i am BWM,let's go");
	}
}
//工厂
class Driver {
	public static Car getCar(String type){
		Car car = null;
		switch (type) {
		case "benze":
			car = new Benze();
			break;
		case "BWM":
			car = new BWM();
			break;
		default:
			break;
		}
		return car;
	}
}
