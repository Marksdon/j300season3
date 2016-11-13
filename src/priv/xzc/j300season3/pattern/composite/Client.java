package priv.xzc.j300season3.pattern.composite;

/**
 * 测试组合模式
 * 适合处理树形结构。当有数据结构是树形结构时，第一时间应该想到这个设计模式
 * 
 * <li>不是类的组合关系
 * <li>非常适合处理树形结构 
 * 
 * <p>核心构件:
 * <li> 抽象构件(Component)角色：定义了叶子和容器构件的共同点
 * <li> 叶子(Leaf)构件角色：无子节点
 * <li> 容器(Composite)构件角色：有容器特征，可以包含子节点
 * 
 * 
 * @author randall
 *
 */
public class Client {

	public static void main(String[] args) {
		
		AbstractFile f2,f3,f4,f5,f6;
		Folder f1 = new Folder("我的收藏");
		
		f2 = new ImageFile("老高的大头像.jpg");
		f3 = new TextFile("a.txt");
		f4 = new VideoFile("老高.ma4");
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("电影");
		f4 = new VideoFile("笑傲江湖.avi");
		f5 = new VideoFile("神雕侠侣.avi");
		
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killViruss();//无论是文件夹还是文件，不管是部分对象还是整体对象，都是统一的处理方式
		/**
		 * 以后碰到树形结构，都不用说，直接想到组合模式
		 * 应用场景：
		 * 1.操作系统的资源管理
		 * 2.GUI的容器层次图
		 * 3.XML文件解析
		 * 4.OA系统中
		 * 5.Junit单元测试框架
		 */
	}
	
	
}
