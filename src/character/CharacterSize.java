package character;

import java.io.UnsupportedEncodingException;

/**
 * @author shizhenbo
 * @title: CharacterSize
 * @projectName leetcode
 * @description: TODO
 * @date 2021/7/199:28
 */
public class CharacterSize {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Byte 的2进制码位数" + Byte.SIZE);

        System.out.println("char 的2进制码位数："+Character.SIZE);

        System.out.println("int 的2进制码位数："+Integer.SIZE);

        System.out.println("short 的2进制码位数："+Short.SIZE);

        System.out.println("long 的2进制码位数："+Long.SIZE);

        System.out.println("float 的2进制码位数："+Float.SIZE);

        System.out.println("double 的2进制码位数："+Double.SIZE);

        String s1="123";

        byte[] buffer=s1.getBytes();

        System.out.println("123: " + buffer.length);

        String s2="abc";

        buffer=s2.getBytes();

        System.out.println("abc: " + buffer.length);

        String s3="哈哈哈";

        buffer=s3.getBytes("UTF-8");

        System.out.println("哈哈哈: " + buffer.length);

        String s4="|"+"\u0001"+"\001"+"\u0003"+"\u000C";

        buffer=s4.getBytes();

        System.out.println("|: " + buffer[0]);

        System.out.println(s4);


    }
}
