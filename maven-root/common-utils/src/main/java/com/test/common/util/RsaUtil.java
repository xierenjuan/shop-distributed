package com.test.common.util;


import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class RsaUtil {
    public static final Logger logger = LoggerFactory.getLogger(RsaUtil.class);
    /**
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;

    /**
     * RSA最大解密密文大小
     */
    private static final int MAX_DECRYPT_BLOCK = 128;


    public static final String privateKeyA = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAI1l9m3/Lt+gVZhiw8j7p77FLw8C7o/ITvZQqs/5Zv17wHgXwHFIUkxCEQ+Nn8Qj60zj+ViTUMNL+KY041oVUj6fOfSAqpVcAalj0stNcbp4hW27TZrTSLpBbXTKezj+o1KyWsKs+Xt6MINCMlccACT6ijEVhX0koQ3wVS5FBwmJAgMBAAECgYBLRaRSGi6RzYDDhpBDRfSekcnja+QjlrayWW8VF+fDuUVUqRBBPgbRoboDVZlfiN+SJypuBL5RuPe9QxpkskT9VjiZ+TDMn0zoocP6uTWX+uW0Cg2calk/cAZv1Kku/MPVyRqHLlgd2cKc9Zlk1fnh3irniZTEEG0cLKhDZRCsgQJBAMr407vPXXl46DkAufjembnUdjvz9rwoidqCDkCoTDABW9HAawLnskXvB/qDIPpl/Cb18nnmqoKPVNWWL96ToS0CQQCyVva5n7Xb475M8429pjKHLRImZ4GD2/bOT0EBRnuV9uM8DvtCwkXBm2wxJ6Z95C8bdETMIq9fqyL9etcW4StNAkBIIJ5VWj40YXPcddagirIEKG0PpwViHeHHBXp9HZFdac4wPnmIob9nPKcQLbL1aHJvgez1xrOHC9owwFsodDvNAkAvYbODdc9XcJaq0zqhXHqoN21PDsj2Q4a7IYtfz14eZc3RsxlGj18BJU4FcUdmwy1Q2f89TSnS/SD6v5xN090xAkEAyAVV1CKdEKrhm74GVcOaaBR3eMZ4UIAfwywQGeHz6xh6sWnjG46buYdlU6AgdcerakN/08leqh+bR2pZZcBxdA==";
    public static final String publicKeyA = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNZfZt/y7foFWYYsPI+6e+xS8PAu6PyE72UKrP+Wb9e8B4F8BxSFJMQhEPjZ/EI+tM4/lYk1DDS/imNONaFVI+nzn0gKqVXAGpY9LLTXG6eIVtu02a00i6QW10yns4/qNSslrCrPl7ejCDQjJXHAAk+ooxFYV9JKEN8FUuRQcJiQIDAQAB";
    public static final String publicKeyB = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCdz7PD9HTlBH9vRiP2JkbCIs6r49FyKN7ZDfMqMF53LS52s27dC1qVTiJpyKMLJeQJK42IWmThy7ISXJ0a9H4hCXYdr4vrxPYB2LDwoH12pqFoHYb/cr34oyNoJaRSd1WX8wGKQ3J8rn+bDEBaatWS9jt0U8blOecHoTu68sKMqwIDAQAB";
    public static final String privateKeyB = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJ3Ps8P0dOUEf29GI/YmRsIizqvj0XIo3tkN8yowXnctLnazbt0LWpVOImnIowsl5AkrjYhaZOHLshJcnRr0fiEJdh2vi+vE9gHYsPCgfXamoWgdhv9yvfijI2glpFJ3VZfzAYpDcnyuf5sMQFpq1ZL2O3RTxuU55wehO7rywoyrAgMBAAECgYEAkBc4fUA0h3Nu4+v4I+VZECN17y6pa4Hzz93T2/6kEk73sLwvCrc2M0NPWqUucZxcNR9GMGzQ1fYGFovnitgYXKKukWS/DGN7Ribahm1wgPdcGEjLKfwVwRG37yFeo4aLoENVgE0Km63UwX68l8RX6pW8Lb4jUxjF+y7kccR3OeECQQDgD4pVB5e6XjyQWr1tUjT1u/QDOTXqtgf2OjOFMd/QhSO56ihmYE4k0pwfYnHc/7tD7GdrzKaNkLM3fJmjAmA7AkEAtE6UQ3OXcyo/VDfwgPRbkfGTNao6+VJcs20zKqY32QNtzlOxX/cwGPHa/sq5GeLV6f1ok7GHNXBLQz2X9S6uUQJAKFpEJJowdk0ghTMCaJzkktkd0jLMhg/wkSTcQIHB+FDyJTqJuh5gFHulyHU3YoDgHhSGb8C0wkwsKrMTDGuSHwJBAJU4ix+fpHGdPzgV66btlHMeOLSrI49/iFS+RSBA2+twGQou3ZcMXfPnBVTktXgk8OBr5oaE399sBf2qFf7GGWECQD+ipnIQEIEy+2ReSUzHeT98RekM9lqK0Z+/zSe765AhBJhpbyirfC9j5g/cSZI5mjtsRLvplhbulUE2LOreyqA=";

    /**
     * 获取私钥
     * @param privateKey 私钥字符串
     * @return PrivateKey
     */
    public static PrivateKey getPrivateKey(String privateKey) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] decodedKey = Base64.decodeBase64(privateKey.getBytes());
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedKey);
            return keyFactory.generatePrivate(keySpec);
        } catch (Exception e){
            logger.error(" get private key is fail : " + e.getMessage());
            return null;
        }
    }
    /**
     * 获取公钥
     * @param publicKey 公钥字符串
     * @return PublicKey
     */
    public static PublicKey getPublicKey(String publicKey) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] decodedKey = Base64.decodeBase64(publicKey.getBytes());
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decodedKey);
            return keyFactory.generatePublic(keySpec);
        }catch (Exception e){
            logger.error(" get public key is fail : " + e.getMessage());
            return null;
        }
    }
    /**
     * 随机生成密钥对
     */
    public static Map<Integer,String> genKeyPair(){
        try {
            // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            // 初始化密钥对生成器，密钥大小为96-1024位
            keyPairGen.initialize(1024,new SecureRandom());
            // 生成一个密钥对，保存在keyPair中
            KeyPair keyPair = keyPairGen.generateKeyPair();
            RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();   // 得到私钥
            RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  // 得到公钥
            String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
            // 得到私钥字符串
            String privateKeyString = new String(Base64.encodeBase64((privateKey.getEncoded())));
            // 将公钥和私钥保存到Map
            Map<Integer, String> keyMap = new HashMap();
            keyMap.put(0,publicKeyString);  //0表示公钥
            keyMap.put(1,privateKeyString);  //1表示私钥
            return keyMap;
        }catch (Exception e){
            logger.error("genarate key is fail : "+ e.getMessage());
            return null;
        }
    }

    /**
     * RSA公钥加密
     * @param str 加密字符串
     * @param publicKey 公钥
     * @return 密文
     */
    public static String encrypt( String str, String publicKey ){
        try {
            //base64编码的公钥
            byte[] decoded = Base64.decodeBase64(publicKey);
            RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
            //RSA加密
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);
            byte[] data = str.getBytes("UTF-8");
            int inputLen = data.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            byte[] cache;
            int i = 0;
            // 对数据分段加密
            while (inputLen - offSet > 0) {
                if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
                    cache = cipher.doFinal(data, offSet, MAX_ENCRYPT_BLOCK);
                } else {
                    cache = cipher.doFinal(data, offSet, inputLen - offSet);
                }
                out.write(cache, 0, cache.length);
                i++;
                offSet = i * MAX_ENCRYPT_BLOCK;
            }
            byte[] encryptedData = out.toByteArray();
            out.close();
            String outStr = Base64.encodeBase64String(encryptedData);
            return outStr;
        } catch (Exception e){
            logger.error("encryption is fail : " + e.getMessage());
            return null;
        }

    }

    /**
     * RSA私钥解密
     * @param str 加密字符串
     * @param privateKey 私钥
     * @return 铭文
     */
    public static String decrypt(String str, String privateKey){
        try {
            //64位解码加密后的字符串
            byte[] data = Base64.decodeBase64(str.getBytes("UTF-8"));
            //base64编码的私钥
            byte[] decoded = Base64.decodeBase64(privateKey);
            RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
            //RSA解密
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, priKey);

            int inputLen = data.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offSet = 0;
            byte[] cache;
            int i = 0;
            // 对数据分段解密
            while (inputLen - offSet > 0) {
                if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
                    cache = cipher.doFinal(data, offSet, MAX_DECRYPT_BLOCK);
                } else {
                    cache = cipher.doFinal(data, offSet, inputLen - offSet);
                }
                out.write(cache, 0, cache.length);
                i++;
                offSet = i * MAX_DECRYPT_BLOCK;
            }
            byte[] decryptedData = out.toByteArray();
            out.close();
            String outStr = new String(decryptedData);
            return outStr;
        }catch (Exception e){
            logger.error("decryption is fail : " + e.getMessage());
            return  null;
        }

    }
     /**
      * 签名
      * @param data 待签名数据
      * @param privateKey 私钥
      * @return 签名
      */
     public static String sign(String data, PrivateKey privateKey){
         try {
             byte[] keyBytes = privateKey.getEncoded();
             PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
             KeyFactory keyFactory = KeyFactory.getInstance("RSA");
             PrivateKey key = keyFactory.generatePrivate(keySpec);
             Signature signature = Signature.getInstance("MD5withRSA");
             signature.initSign(key);
             signature.update(data.getBytes());
             return new String(Base64.encodeBase64(signature.sign()));
         } catch (Exception e){
             logger.error("sign is fail :" + e.getMessage());
             return null;
         }
     }

    /**
     * 验签
     * @param originStr 原始字符串
     * @param publicKey 公钥
     * @param sign 签名
     * @return 是否验签通过
     */
    public static boolean verify(String originStr, PublicKey publicKey, String sign){
        try {
            byte[] keyBytes = publicKey.getEncoded();
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey key = keyFactory.generatePublic(keySpec);
            Signature signature = Signature.getInstance("MD5withRSA");
            signature.initVerify(key);
            signature.update(originStr.getBytes());
            return signature.verify(Base64.decodeBase64(sign.getBytes()));
        } catch (Exception e){
            logger.error("check sign is fail : " + e.getMessage());
            return false;
        }
    }
}
