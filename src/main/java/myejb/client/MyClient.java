package myejb.client;

import myejb.myInterface.MyTimer;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by root on 15-4-3.
 */
public class MyClient {

    public static void main(String[] args) {
        InitialContext context=null;
        try {
            context = new InitialContext();
        } catch (NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            MyTimer myTimer=(MyTimer)context.lookup("myejb.interceptor-1.0/MyBean02!myejb.myInterface.MyTimer");
            System.out.println(myTimer.getTime());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
