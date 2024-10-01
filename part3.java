import java.io.BufferedReader;
import java.net.Socket;
import java.io.InputStreamReader;

public class part3 {
    public static void main(String[] args) {
        try (Socket sck = new Socket("whois.internic.net", 43);) {
            BufferedReader br = new BufferedReader(new InputStreamReader(sck.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String response = "";
            while ((response = br.readLine()) != null) {
                sb.append(response);
            }

            System.out.println(sb.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
