/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ICE4.Contact;
import com.mycompany.ICE4.ContactManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTest {
    private ContactManager contactManager;

    @BeforeEach
    public void setUp() {
        Contact contact1 = new Contact("Ujjwal", "Koirala", "ujjwal@ujjwal.com");
        Contact contact2 = new Contact("Sahil", "Ahmed", "sahil@sahil.com");
        Contact contact3 = new Contact("Kevin", "Brown", "kevin@kevin.com");
        contactManager = new ContactManager(new Contact[]{contact1, contact2, contact3});
    }

    @Test
    public void good() {
        String email = "ujjwal@ujjwal.com";
        Contact result = contactManager.findContact(email);
        assertNotNull(result);
        assertEquals("Ujjwal", result.getFirstName());
    }

    @Test
    public void bad() {
        String email = "dario@dario.com";
        Contact result = contactManager.findContact(email);
        assertNull(result);
    }

    @Test
    public void boundary() {
        String email = "UJJWAL@ujjwal.com";
        Contact result = contactManager.findContact(email);
        assertNotNull(result);
        assertEquals("Ujjwal", result.getFirstName());
    }
    
    @Test
    public void Null() {
        String email = "";
        Contact result = contactManager.findContact(email);
        assertNull(result);
    }
    
    @Test
     public void Null2() {
        String email = null;
        Contact result = contactManager.findContact(email);
        assertNull(result);
    }
     
     @Test
    public void good2() {
        String email = "sahil@sahil.com";
        Contact result = contactManager.findContact(email);
        assertNotNull(result);
        assertEquals("Ahmed", result.getLastName());
    }

    @Test
    public void bad2() {
        String email = "asis@asis.com";
        Contact result = contactManager.findContact(email);
        assertNull(result);
    }

    @Test
    public void boundary2() {
        String email = "SAHIL@sahil.com";
        Contact result = contactManager.findContact(email);
        assertNotNull(result);
        assertEquals("Ahmed", result.getLastName());
    }
        @Test
    public void good3() {
        String email = "kevin@kevin.com";
        Contact result = contactManager.findContact(email);
        assertNotNull(result);
        assertEquals("Kevin", result.getFirstName());
    }
    
    @Test
    public void bad3() {
        String email = "notkevin@kevin.com";
        Contact result = contactManager.findContact(email);
        assertNull(result);
    }

    @Test
    public void boundary3() {
        String email = "KEVIN@KEVIN.com";
        Contact result = contactManager.findContact(email);
        assertNotNull(result);
        assertEquals("Kevin", result.getFirstName());
    }  
}
