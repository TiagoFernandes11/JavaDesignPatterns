package Singleton.lazyInit;

import java.io.Serial;
import java.io.Serializable;

public class DateUtil implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public static DateUtil instance;

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }
}
