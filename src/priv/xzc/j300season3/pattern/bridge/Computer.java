package priv.xzc.j300season3.pattern.bridge;

/**
 * 没有桥接模式的继承样子
 * @author randall
 *
 */
public interface Computer {
	void sale();
}


class Desktop implements Computer{

	@Override
	public void sale() {
		System.out.println("销售台式机");
	}
}
class Laptop implements Computer{
	
	@Override
	public void sale() {
		System.out.println("销售笔记本");
	}
}
class Pad implements Computer{
	
	@Override
	public void sale() {
		System.out.println("销售平板");
	}
}

class LenoveDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售联想台式机");
	}
}
class LenoveLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
	}
}
class LenovePad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售联想平板");
	}
}
class ShenzhouDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售神舟台式机");
	}
}
class ShenzhouLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售神舟笔记本");
	}
}
class ShenzhouPad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售神舟平板");
	}
}
class DellDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售戴尔台式机");
	}
}
class DellLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售戴尔笔记本");
	}
}
class DellPad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售戴尔平板");
	}
}
