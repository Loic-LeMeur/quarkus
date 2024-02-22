package com.worldline.quarkus;

import com.worldline.quarkus.crypto.CryptoImplementation;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

public class CryptoManagerTest {

    @Inject
    CryptoImplementation cipher;

    @Test
    public void EncryptTest(){
        char[] input = {'a','b'};
        String cipherData = cipher.encrypt(input);
        System.out.println(cipherData);
    }
}
