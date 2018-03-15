package testxml;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class AppTest{
    @Test
   public void one (){
      File file=new File("C:\\test\\测试.txt");
        InputStream in = null;
        try {
            // 根据文件创建文件的输入流
            in = new FileInputStream(file);
            // 创建字节数组
            byte[] data = new byte[1024];
            // 读取内容，放到字节数组里面
            in.read(data);
            System.out.println(new String(data));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭输入流
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

}
}
