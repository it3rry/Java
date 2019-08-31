package clock;

/**
 * @title: clock
 * @projectName: clock
 * @description: 实现一份时钟的作用
 * @author: Terry
 * @date: 2019/8/31 15:03
 */
    class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start() {
        while (true) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }
}