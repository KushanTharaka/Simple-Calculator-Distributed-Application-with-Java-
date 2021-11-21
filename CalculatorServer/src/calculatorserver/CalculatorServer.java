package calculatorserver;
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Kushan Tharaka
 */
public class CalculatorServer {

    
    public static void main(String[] args) throws Exception{
        
        ServerSocket ObjServer = new ServerSocket(6778);
        Socket Client = ObjServer.accept();
        
        System.out.println("Client Connected!");
        
        InputStreamReader ObjIn = new InputStreamReader(Client.getInputStream());
        BufferedReader ObjBuffer = new BufferedReader(ObjIn);

        String type = ObjBuffer.readLine();
        String a = ObjBuffer.readLine();
        String b = ObjBuffer.readLine();
        
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int ans;
        
        if(type.equals("+"))
        {
            ans = a1+b1;
        }
        else if(type.equals("-"))
        {
            ans = a1-b1;
        }
        else if(type.equals("*"))
        {
            ans = a1*b1;
        }
        else
        {
            ans = a1/b1;
        }
        System.out.println("Client ::"+ans);
        
        String strans = Integer.toString(ans);        
        PrintWriter objPrint = new PrintWriter(Client.getOutputStream());
        objPrint.println(strans);
        objPrint.flush();
        
    }
    
}
