import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.*;
public class clientChat
{
   static public void main(String[] args){

       try {
           System.out.println("Client is waiting...");
           Socket soc= new Socket("localhost", 9806);

           // buffer reader for reading entire str at a time
           // input stream -> takes byte stream and returns characters stream
           // system.in -> for  reading data from keyboard
           BufferedReader clientInput= new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter your message: ");
           String str= clientInput.readLine(); // input from client

           PrintWriter out= new PrintWriter(soc.getOutputStream(), true); // true for auto flush
           out.println(str);

           // read data from server and print it.
           BufferedReader in= new BufferedReader(new InputStreamReader(soc.getInputStream()));
           System.out.println(in.readLine());

       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
