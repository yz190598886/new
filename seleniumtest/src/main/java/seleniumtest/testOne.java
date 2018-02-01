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
                parm.setPram(a[1]);
                parm.setExpectation(a[2]);
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
            diaoyong(a.getAddr(), a.getPram(),a.getExpectation());
        }

    }

        private static void diaoyong(String addr, String pram,String Expectation) {
            System.out.println(addr+pram+Expectation);
        }
    }

