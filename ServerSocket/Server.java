import java.util.Date;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStreamWriter;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(50)) {
        while (true) {
            wait(server);
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

public static void wait(ServerSocket server) {
        try(Socket connection  = server.accept()) {
            OutputStreamWriter os = new OutputStreamWriter(connection.getOutputStream());
            Date now = new Date();
            os.write(now.toString() + "\n");
            os.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
