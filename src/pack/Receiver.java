package pack;

/*
 * Reader
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class Receiver implements Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		System.out.println("Receiver Start");

		SocketChannel sChannel = SocketChannel.open();
		sChannel.configureBlocking(true);
		if (sChannel.connect(new InetSocketAddress("192.168.1.58", 12345))) {

			ObjectInputStream ois = 
					new ObjectInputStream(sChannel.socket().getInputStream());

			Persona[] as = (Persona[])ois.readObject();
			
			System.out.println("String is: ");

			for (int i = 0; i < as.length; i++) {
				
				System.out.println(as[i].toString());
				
			}

			
		}

		System.out.println("End Receiver");
	}





}
