package EncodeAndDecode;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingAndDecoding {
    public static void main(String[] args) {
        //Encoding
        String st = "Ubaidurrehman khan";
        System.out.println(Base64.getEncoder().encodeToString(st.getBytes(StandardCharsets.UTF_8)));
        //Decoding
        System.out.println(new String(Base64.getDecoder().decode("VWJhaWR1cnJlaG1hbiBraGFu")));



        String name = "Amjad bhai";
        String s = Base64.getEncoder().encodeToString(name.getBytes(StandardCharsets.UTF_8));
        System.out.println("Amjad bahi Encoding"+s);

        byte[] decode = Base64.getDecoder().decode("QW1qYWQgYmhhaQ==");
        System.out.println(new String(decode));
    }
}
