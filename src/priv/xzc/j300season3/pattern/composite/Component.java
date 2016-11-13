package priv.xzc.j300season3.pattern.composite;
/**
 * 组合模式：跟之前类的组合是两码事
 * 抽象组件
 * @author randall
 *
 */
public interface Component {
	void operation();
}

/**
 * 叶子组件
 * @author randall
 *
 */
interface Leaf extends Component {
}

/**
 * 容器组件
 * @author randall
 *
 */
interface Composite extends Component {
	void add(Component c);
	void remove(Component c);
	Component get(int index);
}