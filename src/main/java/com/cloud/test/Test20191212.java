package com.cloud.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test20191212 {

    public static void main(String[] args) {

        /*File file = new File("/Users/cloud/Desktop/惠卡U金");

        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(File.separator);*/

        /*File file = new File("/Users/cloud/Desktop/任务");

        if (!file.exists()) {
            return;
        }

        printFile(file);

        System.out.println("执行完毕！");*/
        /*FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("/Users/cloud/Desktop/惠卡U金"));
            *//*for (;;) {

                int read = fileInputStream.read();

                System.out.println("read : " + read);
                if (-1 == read) {
                    break;
                }
            }*//*

            int n;
            while ( (n = fileInputStream.read()) != -1) {
                System.out.println("read : " + n);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        /*try {
            try (FileInputStream fileInputStream = new FileInputStream(new File("/Users/cloud/Desktop/惠卡U金"))) {
                int n;
                while ( (n = fileInputStream.read()) != -1) {
                    System.out.println("read : " + n);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            try (FileInputStream fileInputStream = new FileInputStream(new File("/Users/cloud/Desktop/惠卡U金"))) {
                byte[] bytes = new byte[1024];
                int n;
                while ( (n = fileInputStream.read(bytes)) != -1) {
                    System.out.println("read : " + n + " bytes");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            byte[] data = { 72, 101, 108, 108, 111, 33 };
            try (InputStream input = new ByteArrayInputStream(data)) {
                int n;
                while ((n = input.read()) != -1) {
                    System.out.println((char)n);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            try (InputStream input = new FileInputStream(new File("/Users/cloud/Desktop/testIO"))) {
                StringBuilder stringBuilder = new StringBuilder();
                int n;
                while ((n = input.read()) != -1) {
                    stringBuilder.append((char)n);
                }
                System.out.println(stringBuilder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            try (OutputStream outputStream = new FileOutputStream("/Users/cloud/Desktop/testIO")) {
                outputStream.write(72);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void printFile(File file){
        File[] listFiles = file.listFiles();

        for (File file1 : listFiles) {
            if (file1.isDirectory()) {
                printFile(file1);
            }else {
                System.out.println("文件名称：" + file1);
            }
        }
    }
}
