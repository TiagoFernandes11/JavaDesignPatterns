package Singleton.eagerInit;

public class DateUtil {
    public static DateUtil instance = new DateUtil();

    // or using static blocks
        /*
        * static{
        *   instace = new DateUtil();
        * }
        * */
    private DateUtil(){}
    public static DateUtil getInstance(){
        return instance;
    }
}
