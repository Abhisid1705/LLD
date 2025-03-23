package consistenthashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

 class HashUtils {
    public static int hash(String key) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(key.getBytes(StandardCharsets.UTF_8));
            // Convert the first 4 bytes to an integer (32-bit hash)
            int hashValue = 0;
            for (int i = 0; i < 4; i++) {
                hashValue = (hashValue << 8) | (hashBytes[i] & 0xFF);
            }
            return hashValue & 0x7FFFFFFF; // Ensure positive value
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }
}