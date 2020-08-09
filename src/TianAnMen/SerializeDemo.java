package TianAnMen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;

public class SerializeDemo {

    public static void main(String[] args) throws IOException {

        Employee e = new Employee();
        e.name = "Reyan Ali!";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 111222333;
        e.number = 101;

        FileOutputStream fos  = null;
        ObjectOutputStream oos = null;
        try {

            fos = new FileOutputStream("/tmp/employee.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.close();
            fos.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }finally {
            if (null != fos){
                fos.close();
            }
        }

    }
}
