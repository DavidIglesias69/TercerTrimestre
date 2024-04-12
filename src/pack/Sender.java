package pack;

/*
 * Writer
 */
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Sender implements Serializable{
	
    public static void main(String[] args) throws IOException {
        System.out.println("Sender Start");

        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        ssChannel.configureBlocking(true);
        int port = 12345;
        ssChannel.socket().bind(new InetSocketAddress(port));

        Persona obj = new Persona("Hector", 19, 1.69 ,'M');
        
        while (true) {
            SocketChannel sChannel = ssChannel.accept();

            ObjectOutputStream  oos = new 
                      ObjectOutputStream(sChannel.socket().getOutputStream());
            oos.writeObject(obj);
            oos.close();

            System.out.println("Connection ended");
        }
    }
}