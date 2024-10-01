import java.io.BufferedReader;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class part3 {
    public static void main(String[] args) {
        try (Socket sck = new Socket("ipinfo.io", 80);) {
            BufferedReader br = new BufferedReader(new InputStreamReader(sck.getInputStream()));

            OutputStream os = sck.getOutputStream();
            OutputStreamWriter out = new OutputStreamWriter(os, "UTF-8");

            out.write("GET / HTTP/1.0\r\n");
            out.write("Host: ipinfo.io\r\n\n");
            out.flush();

            StringBuilder sb = new StringBuilder();
            String response = "";
            while ((response = br.readLine()) != null) {
                sb.append(response + "\n");
            }

            System.out.println(sb.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
