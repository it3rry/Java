package terry;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        System.out.print("你好，欢迎进入管理系统,请输入收款金额：");
        Scanner in = new Scanner(System.in);
        int price ;
        price = in.nextInt();
//        System.out.print("您输入的金额是：");
//        System.out.print(price);

        //应收金额，这里应是一个系统传进来的值，先用一个输入值代替
        Scanner money_result = new Scanner(System.in);
        System.out.print("请输入应收的费用:");
        int money;
        money = money_result.nextInt();

        System.out.print("用找钱：");
        System.out.println(price + "-" + money + "=" + (price - money));
    }
}
