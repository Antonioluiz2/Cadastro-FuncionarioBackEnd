package socket;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketIp {
/*Quando você obtiver o socket conectado ao cliente, 
 * use o método getInetAddress da classe socket, que ela te dará o IP (entre outras informações) 
 * sobre o cliente que está conectado ao seu programa. 
 * Com o método getAddress da class InetAddress você pode obter o IP do cliente*/
	public static void main(String[] args) {
		 int portNumber = 8000;

		    try {
		        ServerSocket serverSocket = new ServerSocket(portNumber);
		        Socket clientSocket = serverSocket.accept();
		        InetAddress address = clientSocket.getInetAddress();
		        byte[] ip = address.getAddress();
		        System.out.print("Client IP: ");
		        for (int i = 0; i < ip.length; i++) {
		            System.out.print(ip[i] & 0xFF);
		            if (i < ip.length - 1) System.out.print(".");
		        }
		        System.out.println();
		        clientSocket.close();
		        serverSocket.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}

//	private static final String[] HEADERS_TO_TRY = {
//            "X-Forwarded-For",
//            "Proxy-Client-IP",
//            "WL-Proxy-Client-IP",
//            "HTTP_X_FORWARDED_FOR",
//            "HTTP_X_FORWARDED",
//            "HTTP_X_CLUSTER_CLIENT_IP",
//            "HTTP_CLIENT_IP",
//            "HTTP_FORWARDED_FOR",
//            "HTTP_FORWARDED",
//            "HTTP_VIA",
//            "REMOTE_ADDR" };
//
//private String getClientIpAddress(HttpServletRequest request) {
//    for (String header : HEADERS_TO_TRY) {
//        String ip = request.getHeader(header);
//        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
//            return ip;
//        }
//    }
//
//    return request.getRemoteAddr();
//}
}
