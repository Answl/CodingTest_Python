import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim(); //앞뒤 공백 제거
        
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
    }
}