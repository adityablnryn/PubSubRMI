package remoteobj;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by balan016 on 2/8/18.
 */
public interface PubSubService extends Remote{
    public int join() throws RemoteException;
    public void leave(int id) throws RemoteException;
    public void ping(int clientId) throws RemoteException;
    public int publish() throws RemoteException;
    public int subscribe() throws RemoteException;
}
