package auto.data.util;

import java.io.IOException;
import java.util.Properties;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.jasypt.properties.EncryptableProperties;

public class EncryptorHelper {
	public static EncryptorHelper INSTANCE = new EncryptorHelper();
	Properties props = null;
	 private static final String SECRET_KEY = "iu*x3jm9eu";  // Change this for security
	 private static final String PROPERTIES_FILE = "src/main/resources/configuration.properties";
	private EncryptorHelper() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setAlgorithm("PBEWithHmacSHA512AndAES_256");
		encryptor.setIvGenerator(new RandomIvGenerator());
		encryptor.setPoolSize(4);
		encryptor.setPassword(SECRET_KEY);
		props = new EncryptableProperties(encryptor);
		try {
			props.load(new java.io.FileInputStream(PROPERTIES_FILE));
		}
		catch(IOException e){
			System.out.println("Error Loading Properties File " + e.getMessage());
		}
		
	}
	public String getProperty(final String key) {
		return props.getProperty(key);
	}

}
