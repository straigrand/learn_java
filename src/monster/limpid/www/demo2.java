package monster.limpid.www;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("用next方式接收");

        //判断用户有没有输入
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入的内容为："+str);
        }

        scanner.close();
    }
}
