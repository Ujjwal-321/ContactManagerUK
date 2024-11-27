package com.mycompany.ICE4;
public class ContactManager {
    private Contact[] contactList;

    public ContactManager(Contact[] contactList) {
        this.contactList = contactList;
    }
    public Contact findContact(String emailAddress) {
        for (Contact contact : contactList) {
            if (contact != null && contact.getEmailAddress().equalsIgnoreCase(emailAddress)) {
                return contact;
            }
        }
        return null;
    }
}
