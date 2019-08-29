package terry;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        System.out.print("你好，欢迎进入管理系统,请输入收款金额：");
        Scanner in = new Scanner(System.in);
        int price ;
        price = in.nextInt();

        System.out.print("请输入应收的费用:");
        int money;
        money = in.nextInt();

        System.out.print("用找钱：");
        System.out.println(price + "-" + money + "=" + (price - money));
    }
}
