

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {
	
	public String helloTo(String name) throws RemoteException;
	public Integer square(Integer num) throws RemoteException;

}
