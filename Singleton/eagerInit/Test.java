package Singleton.eagerInit;

public class Test {
    private static final DateUtil dateUtil = DateUtil.getInstance();
    private static final DateUtil dateUtil2 = DateUtil.getInstance();
    public static void main(String[] args) {
        System.out.println(dateUtil);
        System.out.println(dateUtil2);
        System.out.println(dateUtil == dateUtil2);
    }
}
