package cn.bitqian.service;

import cn.bitqian.exception.MyException;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 用来产生异常的服务类
 * @author echo lovely
 * @date 2020/9/8 14:43
 */
@Service
public class UserService {

     public void numberFormatException() throws NumberFormatException {
         Integer integer = new Integer("hhh");
         System.out.println(integer);
     }

    public void divideException() {
        System.out.println(1/0);
    }

    public void fileNotFoundException() throws FileNotFoundException {
         new FileInputStream("c:/x.xx/x.xx");
    }

    public void showNullPointer() throws NullPointerException {
         String str = null;
         System.out.println(str.length());
    }

    public void myDefineException() throws MyException {
        System.out.println("my exception");
        throw new MyException();
    }

}
