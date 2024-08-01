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
public class ClientProgram {
	public static void main(String[] args) {
		
		System.out.println("Client Program started.....");
		
		try {
			System.out.println("Client is trying to connect to "+args[0]+ "on port 4000");
			Socket socket = new Socket(args[0],4000);
			System.out.println("Aha!! connected to the server "+socket.getInetAddress()+" and port "+socket.getPort());
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println(args[1]);
	
			InputStream input = socket.getInputStream(); //READ FROM SOCKET
			InputStreamReader isr = new InputStreamReader(input); // PASS IT TO CONVERTER from byte based to char based
			BufferedReader buff = new BufferedReader(isr); //FASTER READING
			String strFromClient = buff.readLine();
			
			System.out.println("Server is saying  : "+strFromClient);
			
			
			
			buff.close();
			isr.close();
			input.close();
			
			pw.close();
			socket.close();
			
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
