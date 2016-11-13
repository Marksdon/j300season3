package priv.xzc.j300season3.pattern.flyweight;

/**
 * 抽象享元类
 * @author randall
 *
 */
public interface ChessFlyweiht {

	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}


/**
 * 具体的享元类
 */
class ConcreteChess implements ChessFlyweiht {

	/**
	 * 用成员封装共享数据
	 */
	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	/**
	 * 这里增添外部处理
	 */
	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色:" + color);
		System.out.println("棋子位置" + c.getX() + "-----" + c.getY());
	}

}