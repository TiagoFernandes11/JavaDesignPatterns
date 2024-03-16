package Singleton.lazyInit;

import Singleton.eagerInit.DateUtil;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil = DateUtil.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/Tiago Ribeiro/OneDrive/Documentos/GitHub/JavaDesignPatterns/Singleton/lazyInit/DateUtil.ser")));
        oos.writeObject(dateUtil);

        DateUtil dateUtil2 = DateUtil.getInstance();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/Tiago Ribeiro/OneDrive/Documentos/GitHub/JavaDesignPatterns/Singleton/lazyInit/DateUtil.ser")));
        ois.readObject();
        System.out.println(dateUtil == dateUtil2);
    }
}
