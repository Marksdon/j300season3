package priv.xzc.j300season3.pattern.factorymethod;

/**
 * 工厂方法模式
 * 添加新的产品，要添加新的类,没有违反ocp(open-closed principle)原则，但是添加了类的冗余
 * @author randall
 *
 */
public class Client {
	//要奥迪，就通过奥迪工厂
	Car c1 = new AudiFactory().createCar();
	Car c2 = new BydFactory().createCar();
	
	/*Car c3 = new AudiFactory().createCar();*/
}
