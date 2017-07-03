package tests;

import org.junit.*;
import sheshbesh.Encrypt;
import sheshbesh.SQLiteJDBC;


import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import static org.junit.Assert.assertEquals;


public class DB {
    private static String userName = "Moshe";
    private static String password = "789456";

    @BeforeClass
    public static void addUser(){
        SQLiteJDBC.signUp(userName,password);
    }
    @Test
    public void testIsExist(){
        assertEquals(SQLiteJDBC.userExists(userName),true);
    }
    @Test
    public void testSameUserName(){
        int result = SQLiteJDBC.signUp(userName,password);
        assertEquals(result,2);
    }
    @Test
    public void testUpdateScore(){
        SQLiteJDBC.updateScore(userName);
        int score = SQLiteJDBC.getUserScore(userName);
        assertEquals(score,1);
    }
    @Test
    public void testEncryptionValidation(){
        String hash = "";
        try {
            hash = Encrypt.generateHash(password);
            assertEquals(Encrypt.validatePassword(password,hash),true);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public static void deleteUser(){
        SQLiteJDBC.deleteUser(userName);

    }
    }

