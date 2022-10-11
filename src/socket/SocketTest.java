package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
	/*E o código a seguir é para um programa cliente que simplesmente se conecta ao servidor
	 *  e imprime os dados recebidos e depois termina:*/

	public static void main(String[] args) {
//		 if (args.length < 2) return;
//		 
//	        String hostname = args[0];
//	        int port = Integer.parseInt(args[1]);
//	 
//	        try (Socket socket = new Socket(hostname, port)) {
//	 
//	            InputStream input = socket.getInputStream();
//	            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//	 
//	            String time = reader.readLine();
//	 
//	            System.out.println(time);
//	 
//	 
//	        } catch (UnknownHostException ex) {
//	 
//	            System.out.println("Server not found: " + ex.getMessage());
//	 
//	        } catch (IOException ex) {
//	 
//	            System.out.println("I/O error: " + ex.getMessage());
//	    }
//	        System.out.println(hostname);
//	}
		
		/*3. Exemplo de cliente de soquete Java nº 2: um cliente Whois
Whois é um serviço de Internet que permite consultar informações sobre um nome de domínio específico.
O InterNIC (The Network Information Center) fornece um serviço Whois na porta número 43 (a porta 43 é para o protocolo Whois).
Assim, podemos desenvolver o seguinte programa para “whois” qualquer nome de domínio que desejarmos:*/
	if (args.length < 1) return;
	 
    String domainName = args[0];

    String hostname = "whois.internic.net";
    int port = 43;

    try (Socket socket = new Socket(hostname, port)) {

        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println(domainName);

        InputStream input = socket.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (UnknownHostException ex) {

        System.out.println("Server not found: " + ex.getMessage());

    } catch (IOException ex) {

        System.out.println("I/O error: " + ex.getMessage());
    }
    
	}
}
