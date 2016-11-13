package priv.xzc.j300season3.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象构件
 * @author randall
 *
 */
public interface AbstractFile {
	/**
	 * 杀毒，相当与operation()方法
	 */
	void killViruss();//杀毒
}

class TextFile implements AbstractFile {

	private String name;
	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void killViruss() {
		System.out.println("---文本文件" + name +"，进行查杀");
	}

}
class ImageFile implements AbstractFile {

	private String name;
	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void killViruss() {
		System.out.println("---图像文件" + name +"，进行查杀");
	}

}
class VideoFile implements AbstractFile {

	private String name;
	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void killViruss() {
		System.out.println("---视频文件" + name +"，进行查杀");
	}

}

class Folder implements AbstractFile{

	private String name;
	private List<AbstractFile> list = new ArrayList<>();  
	public Folder(String name) {
		this.name = name;
	}

	public void add(AbstractFile file){
		list.add(file);
	}


	public void remove(AbstractFile file){
		list.remove(file);
	}

	public AbstractFile getChild(int index){
		return list.get(index);
	}
	@Override
	public void killViruss() {
		System.out.println("---文件夹" + name +"，进行查杀");
		//这里有个天然的递归
		for(AbstractFile file: list){
			file.killViruss();//当file对象是文件夹时就是递归了
		}
	}

}
