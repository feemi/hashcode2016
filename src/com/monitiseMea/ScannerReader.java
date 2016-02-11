package com.monitiseMea;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ScannerReader {

    public static void main(String[] args) throws Exception{
        System.out.println("Hello World");

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("test.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
