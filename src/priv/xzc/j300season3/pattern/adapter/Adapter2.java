package priv.xzc.j300season3.pattern.adapter;

/**
 * 适配器(相当于usb和ps/2的转接器)
 * ，实现了Targer接口
 * 前面的适配器联系被适配对象使用了继承，这种方式有个弊端，就是java只能单继承
 * <p>这个适配器，使用了组合,可以起到相同吧的效果
 * @author randall
 *
 */
public class Adapter2  implements Target{

	/**
	 * 这个适配器使用组合的关系，这样子可以与多个被适配对象联系
	 */
	private Adaptee Adaptee;
	
	public Adapter2(priv.xzc.j300season3.pattern.adapter.Adaptee adaptee) {
		Adaptee = adaptee;
	}


	@Override
	public void handleReq() {
		Adaptee.request();//可以直接就使用被适配对象的放 方法
	}

}
