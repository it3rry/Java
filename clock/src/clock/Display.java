/**
 * @title: Display
 * @projectName: clock
 * @description: 实现时钟的功能
 * @author: Terry
 * @date: 2019/8/31 14:33
 */
package clock;

public class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int limit)
    {
        this.limit = limit;
    }

    public  void  increase ( ){
        value++;
        if (value == limit){
            value = 0;
        }
    }

    public  int getValue (){
        return  value;
    }
    public static void main(String[] args) {
        Display d = new Display(24);
        for (;;){
            d.increase();
            System.out.println(d.getValue());
        }
    }
}
