 /**
 　　* @description: 模拟收银系统
 　　* @param ${tags}
 　　* @return ${return_type} 
 　　* @throws
 　　* @author Terry
 　　* @date 2019/8/29 17:14 
 　　*/
package terry;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

 public class cashrrgiter {
    public static void main(String[] args) {

        System.out.print("你好，欢迎进入管理系统,请输入收款金额：");
        Scanner in = new Scanner(System.in);
        int price ;
        price = in.nextInt();

        System.out.print("请输入应收的费用:");
        int money;
        money = in.nextInt();

        System.out.print("应找钱：");
        System.out.println(price + "-" + money + "=" + (price - money));

    }
}
