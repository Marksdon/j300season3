package priv.xzc.j300season3.pattern.flyweight;

/**
 * 测试享元模式
 * 3个要点：
 * 1.工厂+池，创建和管理享元对象
 * 2.外部用单独的类处理
 * 3.内部用享元类，用成员变量存储共享数据
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {

		ChessFlyweiht chess1 = ChessFylweightFactory.getChess("黑色");
		ChessFlyweiht chess2 = ChessFylweightFactory.getChess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);//可以看到这是相同的对象

		//增添外部状态的处理
		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
		

	}
}
