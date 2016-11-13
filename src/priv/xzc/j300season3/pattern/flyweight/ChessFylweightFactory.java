package priv.xzc.j300season3.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author randall
 *
 */
public class ChessFylweightFactory {

	/**
	 * 享元池
	 */
	private static Map<String, ChessFlyweiht> map = new HashMap<>();
	
	/**
	 * 提供返回享元对象
	 * @param color 颜色
	 * @return 享元对象
	 */
	public static ChessFlyweiht getChess(String color){
		if (map.get(color) != null) {
			return map.get(color);
		} else {
			ChessFlyweiht cf = new ConcreteChess(color);
			map.put(color, cf);
			return cf;
		}
		
		
	}
	
}
