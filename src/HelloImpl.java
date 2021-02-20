import java.rmi.RemoteException;

public class HelloImpl implements HelloInterface {

	@Override
	public String helloTo(String name) throws RemoteException {
		return "Say hello to "+name;
	}

	@Override
	public Integer square(Integer num) throws RemoteException {
		return num*num;
	}

}
