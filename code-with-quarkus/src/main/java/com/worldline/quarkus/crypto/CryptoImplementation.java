package com.worldline.quarkus.crypto;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CryptoImplementation {

    public String encrypt(char[] input){
        int length = input.length;
        int newValue;
        String cipher ="";
        char newChar;
        for (int i=0; i<length; i++){
            int castAscii = (int) input[i];
            Log.info("Code ascii de "+input[i]+" : "+ castAscii);
            newValue = castAscii + 3;
            newChar = (char) newValue;
            cipher += newChar;
        }
        return cipher;
    }

    public String decrypt(char[] input){
        int length = input.length;
        int newValue;
        String cipher ="";
        char newChar;
        for (int i=0; i<length; i++){
            int castAscii = (int) input[i];
            Log.info("Code ascii de "+input[i]+" : "+ castAscii);
            newValue = castAscii - 3;
            newChar = (char) newValue;
            cipher += newChar;
        }
        return cipher;
    }


}
