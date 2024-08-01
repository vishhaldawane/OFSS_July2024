import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket; // Socket_Impl
import java.net.Socket;
//18:00
/*
 
			cmd window1				cmd window2
				|						|
		java ServerProgram			java ClientProgram HI_IM_CLIENT
											  |				|
 				<-----------------------------|--------------+
 				Socket clientSock = servSock.accept();
 				clientSock.getInputStream()
 												
 		PrintWriter pw = clientSock.getOutputStream(); ------>
 		pw.println("HELLO IM SERVER");
 				
 						
 */
public class ServerProgram {
	public static void main(String[] args) {
		
		System.out.println("Server Program started.....");
		
		try {
			ServerSocket serverSock = new ServerSocket(4000);
			System.out.println("Server is ready and listening for client at port number 4000");
			Socket clientSock = serverSock.accept(); // blocking call
			//awating for the client program to connect
			System.out.println("Aha!! got the client connected from : "+clientSock.getInetAddress()+" and port "+clientSock.getPort());
			InputStream input = clientSock.getInputStream(); //READ FROM SOCKET
			InputStreamReader isr = new InputStreamReader(input); // PASS IT TO CONVERTER from byte based to char based
			BufferedReader buff = new BufferedReader(isr); //FASTER READING
			String strFromClient = buff.readLine();
			
			System.out.println("Client is saying  : "+strFromClient);
			PrintWriter pw = new PrintWriter(clientSock.getOutputStream(),true);
			pw.println(args[0]);
	
			buff.close();
			isr.close();
			input.close();
			
			pw.close();
			clientSock.close();
			serverSock.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		PrintWriter pw = new PrintWriter(System.out,true);
		
		pw.println("Hello1");
		pw.println("Hello2");

		pw.println("Hello3");
*/
		//pw.flush();
		
		System.out.println("End");
		
	}
}
