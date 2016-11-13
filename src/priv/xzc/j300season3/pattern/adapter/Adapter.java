package priv.xzc.j300season3.pattern.adapter;

/**
 * 适配器(相当于usb和ps/2的转接器)
 * ，实现了Targer接口
 * @author randall
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleReq() {
		super.request();//可以直接就使用被适配对象的放 方法
	}

}
