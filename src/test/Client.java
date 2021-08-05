package test;

import com.*;

import java.time.LocalDateTime;
import java.util.List;

public class Client {
    private Contact me;
    private List<Contact> contactList;
    private List<List<Contact>> groups;

    public ChatDuo sendToContact(ChatDuo messageToContact, Text message) {
        messageToContact.addMessage(message);
        return messageToContact;
    }

    public ChatGroup sendToGroup(ChatGroup messageToGroup, Text message) {
        messageToGroup.addMessage(message);
        return messageToGroup;
    }

    public Client(Contact me, List<Contact> contactList) {
        this.me = me;
        this.contactList = contactList;
    }

    public Contact getMe() {
        return me;
    }

    public void setMe(Contact me) {
        this.me = me;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<List<Contact>> getGroups() {
        return groups;
    }

    public void setGroups(List<List<Contact>> groups) {
        this.groups = groups;
    }
}
