public class Main {
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher(5);

        // Simply replace the empty strings below with your custom text.
        System.out.println(cc.encrypt("", 5));
        System.out.println(cc.decrypt("", 5));
        System.out.println(cc.autoDecrypt(""));
        System.out.println(cc.encryptTwoKeys("", 21, 8));
        System.out.println(cc.decryptTwoKeys("", 21, 8));
        System.out.println(cc.autoDecryptTwoKeys(""));
        
        // If the program is not working, uncomment the following line to bruteforce the key. 
        // cc.bruteForce("");
    }
}