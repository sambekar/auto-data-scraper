package auto.data.util;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.jasypt.properties.PropertyValueEncryptionUtils;

import java.io.*;
import java.util.Properties;

public class JasyptPropertiesEncryption {
    private static final String SECRET_KEY = "iu*x3jm9eu";  // Change this for security
    private static final String PROPERTIES_FILE = "src/main/resources/configuration.properties";

    public static void main(String[] args) {
        try {
            Properties properties = loadProperties(PROPERTIES_FILE);

            // Encrypt and save properties
            encryptProperties(properties, PROPERTIES_FILE);
            System.out.println("Encrypted properties saved!");

            // Load and decrypt properties
            Properties encryptedProperties = loadProperties(PROPERTIES_FILE);
            decryptProperties(encryptedProperties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to configure the encryptor
    private static PooledPBEStringEncryptor getEncryptor() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setPassword(SECRET_KEY);
        encryptor.setPoolSize(4);  // Use a pool of encryptors
        return encryptor;
    }

    // Load properties from file
    private static Properties loadProperties(String fileName) throws IOException {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(fileName)) {
            properties.load(input);
        }
        return properties;
    }

    // Encrypt and save properties
    private static void encryptProperties(Properties properties, String fileName) throws IOException {
        PooledPBEStringEncryptor encryptor = getEncryptor();
        encryptor.setAlgorithm("PBEWithHmacSHA512AndAES_256");
		encryptor.setIvGenerator(new RandomIvGenerator());
		encryptor.setPoolSize(4);
		encryptor.setPassword(SECRET_KEY);

        for (String key : properties.stringPropertyNames()) {
            String originalValue = properties.getProperty(key);

            // Encrypt only if it's not already encrypted
            if (!PropertyValueEncryptionUtils.isEncryptedValue(originalValue)) {
                String encryptedValue = PropertyValueEncryptionUtils.encrypt(originalValue, encryptor);
                properties.setProperty(key, encryptedValue);
            }
        }

        try (OutputStream output = new FileOutputStream(fileName)) {
            properties.store(output, "Encrypted Properties");
        }
    }

    // Decrypt and print properties
    private static void decryptProperties(Properties properties) {
        PooledPBEStringEncryptor encryptor = getEncryptor();
        encryptor.setAlgorithm("PBEWithHmacSHA512AndAES_256");
		encryptor.setIvGenerator(new RandomIvGenerator());
		encryptor.setPoolSize(4);
		encryptor.setPassword(SECRET_KEY);

        System.out.println("\nDecrypted Properties:");
        for (String key : properties.stringPropertyNames()) {
            String encryptedValue = properties.getProperty(key);

            if (PropertyValueEncryptionUtils.isEncryptedValue(encryptedValue)) {
                String decryptedValue = PropertyValueEncryptionUtils.decrypt(encryptedValue, encryptor);
                System.out.println(key + " = " + decryptedValue);
            } else {
                System.out.println(key + " = " + encryptedValue);
            }
        }
    }
}
