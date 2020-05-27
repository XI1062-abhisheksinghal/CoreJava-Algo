package com.mckc.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


public class SecurityCodingPractice {
	
	public static void main(String args[]) {
		
		//Make a practice to use SecureRandom Instead of Random Library , as secure random Class uses the algorithm SHA1Prng 
		
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(10));
		
		SecureRandom secureRnd = new SecureRandom();
		System.out.println(secureRnd.nextFloat());
		
		//Lets do some encrytption and Decryption of Data 
		
		String s = "String to be Encrypted";
		
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("AES");
			keyGen.init(128);
			
           SecretKey secretKey = keyGen.generateKey();
           
           Cipher ces = Cipher.getInstance("AES");
           ces.init(Cipher.ENCRYPT_MODE, secretKey);
           byte[] stringtoByte = s.getBytes();
           
           byte[] bCypherText = ces.doFinal(stringtoByte);
           System.out.println(secretKey);
           
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
