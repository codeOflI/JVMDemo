package chapter2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*指令8:异常处理*/
public class ExceptionTest {
    public void throwZero(int i) {
        if (i == 0) {
            throw new RuntimeException(" 参数值为0");
        }
    }

    public void throw0ne(int i) throws RuntimeException {
        if (i == 1) {
            throw new RuntimeException(" 参数值为1");
        }
    }

    public void throwArithmetic() {
        int i = 10;
        int j = i / 0;
        System.out.println(j);
    }

    public void tryCatch() {
        try {
            File file = new File("d: /hello.txt");
            FileInputStream fis = new FileInputStream(file);
            String info = "hello!";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    //思考:如下方法返回结果为多少?
    public static String func() {
        String str = "hello";
        try {
            return str;
        } finally {
            str = "atguigu";
        }
    }
    //思考:如下方法返回结果为多少?
    public static String func2() {
        String str = "hello";
        try {
            str = "hello";
        } finally {
            str = "atguigu";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(func());//hello
        System.out.println(func2());//hello
    }

}