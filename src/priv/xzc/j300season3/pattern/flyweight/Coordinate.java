package priv.xzc.j300season3.pattern.flyweight;

/**
 * 坐标类
 * 外部状态，相当于UnsharedConreteFlyweight
 * 非共享的的享元类
 * @author randall
 *
 */
public class Coordinate {
	private int x,y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


}
