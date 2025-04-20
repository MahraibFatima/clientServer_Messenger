import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serverChat {
    static public void main(String[] args){

        try {
            System.out.println("Server is working...");
            ServerSocket ss= new ServerSocket(9806);
            Socket soc= ss.accept();
            System.out.println("Connection Established!");

            //read the message of client socket
            BufferedReader in= new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str= in.readLine();
            System.out.println("Client says: "+ str);

            PrintWriter out= new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says: "+ str);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
