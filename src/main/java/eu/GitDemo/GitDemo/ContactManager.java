package eu.GitDemo.GitDemo;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private final List<Contact> contacts;


    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Le contact passé est null.");
        }
        contacts.add(contact);
    }


    public boolean supprimerContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Le contact passé est null.");
        }
        return contacts.remove(contact);
    }

    public boolean modifierContact(Contact ancienContact, Contact nouveauContact) {
        if (ancienContact == null || nouveauContact == null) {
            throw new IllegalArgumentException("Les contacts passés sont null.");
        }

        // Recherche de l'index de l'ancienContact
        int index = contacts.indexOf(ancienContact);
        if (index == -1) {
            // Aucun contact égal à ancienContact n'a été trouvé
            return false;
        }

        contacts.set(index, nouveauContact);
        return true;
    }

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }
}
