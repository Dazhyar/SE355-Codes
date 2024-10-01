import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            // InetAddress inward = InetAddress.getLocalHost();
            InetAddress inward = InetAddress.getByName("dazhyar");
            Socket sck = new Socket("time.nist.gov", 13, inward, 10000);
            InputStream is = sck.getInputStream();
            InputStreamReader ir = new InputStreamReader(is);

            int b = 0;
            while ((b = ir.read()) != -1) {
                System.out.println(b);
            }

            sck.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}