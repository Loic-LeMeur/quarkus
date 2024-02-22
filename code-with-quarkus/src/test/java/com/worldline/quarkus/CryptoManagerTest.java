package com.worldline.quarkus;

import com.worldline.quarkus.crypto.CryptoImplementation;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
 import org.wildfly.common.Assert;
@QuarkusTest
public class CryptoManagerTest {

    @Inject
    CryptoImplementation cipher;

    @Test
    public void EncryptTest(){
        char[] input = {'a','b'};
        String cipherData = cipher.encrypt(input);
        Assert.assertTrue("de".equals(cipherData));
    }

    @Test
    public void DecryptTest(){
        char[] input = {'d', 'e'};
        String decryptData = cipher.decrypt(input);
        Assert.assertTrue("ab".equals(decryptData));
    }
}
