package abstractfactory;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String type) {
        DaoAbstractFactory daoFactory = null;
        if (type.equalsIgnoreCase("xml")) {
            daoFactory = new XMLDaoFactory();
        } else if (type.equalsIgnoreCase("db")) {
            daoFactory = new DBDaoFactory();
        }
        return daoFactory;
    }
}
