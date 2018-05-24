package seleniumtest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class testOne {


    private static List<Parm> list = new ArrayList<>();

    public static void file() throws IOException {
      File file=new File("H:\\1.txt");

      BufferedReader input =new BufferedReader(new FileReader(file));
      String text="";
        while((text=input.readLine())!=null){
            Parm parm=new Parm();
            String [] a=text.split(",");
            parm.setAddr(a[0]);
            parm.setPramOne(a[1]);
            parm.setPramTwo(a[2]);
            list.add(parm);
            System.out.println(list);

        }
    }
    public static void main(String[] args) throws IOException {
        file();
        for (Parm a : list) {
            // TODO
            diaoyong(a.getAddr(), a.getPramOne(),a.getPramTwo());
        }

    }

        private static void diaoyong(String addr, String PramOne,String PramTwo) {
            System.out.println(addr+"   "+PramOne+"   "+PramTwo);
        }
    }

