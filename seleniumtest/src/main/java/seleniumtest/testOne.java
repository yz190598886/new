package seleniumtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class testOne {


    private static List<Parm> list = new ArrayList<>();

    public static void file() {

        File file = new File("H:\\1.txt");

        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String text = "";
            while ((text = input.readLine()) != null) {
                Parm parm = new Parm();
                String[] a = text.split(",");
                parm.setAddr(a[0]);
                parm.setPramOne(a[1]);
                parm.setPramTwo(a[2]);
                list.add(parm);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
    public static void main(String[] args) {
        file();
        for (Parm a : list) {
            // TODO
            diaoyong(a.getAddr(), a.getPramOne(),a.getPramTwo());
        }

    }

        private static void diaoyong(String addr, String PramOne,String PramTwo) {
            System.out.println(addr+"--"+PramOne+"--"+PramTwo);
        }
    }

