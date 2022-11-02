package section8_Arrays.coding_exercise_44;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private List<Contact> contacts = new ArrayList<>();


    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            contacts.set(position, newContact);
            System.out.println("Contact: " + oldContact.getName() + " was replaced with: " + newContact.getName());
            return true;
        } else {
            System.out.println("Contact does not exist!");
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            contacts.remove(contact);
            System.out.println("Contact: " + contact.getName() + " was deleted.");
            return true;
        } else {
            System.out.println("Contact does not exist!");
            return false;
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return contacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        if (!contacts.isEmpty()) {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            }
        } else {
            System.out.println("Contact list is empty!");
        }

    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
