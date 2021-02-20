import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyClient {
	
	private HelloInterface remoteServer;
	private final String SERVER_URL="//localhost/MyServer";
	
	public static void main(String[] args) {
		MyClient mc=new MyClient();
		mc.connect();
		
	}
	private void connect() {
		try {
			System.out.println("[Client] Connecting to: "+SERVER_URL);
			remoteServer=(HelloInterface)Naming.lookup(SERVER_URL);
			System.out.println("[Client] Connected to: "+SERVER_URL);
			
			final String name="Pippo";
			System.out.println("[Client] Invoking remote method: helloTo() passing parameter: "+name);
			String response=remoteServer.helloTo(name);
			System.out.println("[Client] Response returned from Server: "+response);
			int number=5;
			System.out.println("[Client] Invoking remote method: square() passing parameter: "+number);
			Integer square=remoteServer.square(number);
			System.out.println("[Client] Response returned from Server: "+square);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
