package Singleton.lazyInit;

public class DateUtil {
    public static DateUtil instance;
    private DateUtil(){}
    public static DateUtil getInstance(){
        if(instance == null){
            instance = new DateUtil();
        }
        return instance;
    }
}
