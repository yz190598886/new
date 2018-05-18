package seleniumtest;

import java.io.*;

public class ReadTxt {
//        File file=new File("H:\\测试文档.txt");
//        BufferedReader reader=null;
//        String temp=null;
//        int lineNum=1;
////        int line=1;
//        try{
//            reader=new BufferedReader(new FileReader(file));
//            while((temp=reader.readLine())!=null){
//                System.out.println(temp);
////                line++;
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//        finally{
//            if(reader!=null){
//                try{
//                    reader.close();
//                }
//                catch(Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }

        public static void main(String[] args) throws IOException {
            for(int a=1;a<3;a++){
                ma(a);
            }

        }

        public static void ma(int number) throws IOException {
            String one = "";
            String two = "";
            File file = new File("H:\\1.txt");//文件路径
            FileReader fileReader = new FileReader(file);
            LineNumberReader reader = new LineNumberReader(fileReader);
//            int number = 2;//设置指定行数
            String txt = "";
            int lines = 0;
            while (txt != null) {
                lines++;
                txt = reader.readLine();
                if (lines == number) {
                    String[] str = txt.split(",");

                    for (int i = 0; i < str.length; i++) {
                        if (i % 2 == 0) {
                            one = str[i];
                        } else {
                            two = str[i];

                        }
                    }

                }

            }

            System.out.println(one + "\n"
                    + two);

            reader.close();
            fileReader.close();
        }
}
