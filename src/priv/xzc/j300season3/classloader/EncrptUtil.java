package priv.xzc.j300season3.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 加密工具类
 * 用于class信息的(加密)取反
 * @author randall
 *
 */
public class EncrptUtil {

	
	
	
	
	
	/**
	 * 将源文件取反保存到目标文件
	 * @param srcPath 源文件路径
	 * @param destPath 目标文件路径
	 */
	public static void encrpt(String srcPath, String destPath){
		File src = new File(srcPath);
		File dest = new File(destPath);
		encrpt(src, dest);
	}
	
	/**
	 * 将文件{@code src} 取反保存到{@code dest}
	 * @param src {@linkplain File}对象,源文件
	 * @param dest {@linkplain File}对象，目标文件
	 */
	public static void encrpt(File src, File dest){

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);

			int temp = -1;
			while ((temp = fis.read()) != -1) {
				fos.write(temp^0xff);//取反操作
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					fis = null;
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					fos = null;
				}
			}
		}

	}

}
