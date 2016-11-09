package priv.xzc.j300season3.pattern.factorymethod;

/**
 * 工厂方法模式
 * 添加新的产品就要添加新的类来实现，类的冗余度就大了
 * @author randall
 *
 */
public interface CarFactory {
	Car createCar();
}
