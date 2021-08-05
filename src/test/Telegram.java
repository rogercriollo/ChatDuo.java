package test;

import com.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Telegram {
    public static void main(String[] args) {

        // creamos los los contactos de nuestra aplicaacion
        Contact me = new Contact("roger", "0960552560", "ocupado", LocalDateTime.now());
        Contact papa = new Contact("hugo", "0960554160", "disponible", LocalDateTime.now());
        Contact mama = new Contact("carmen", "0985554250", "en reunion", LocalDateTime.now());
        // creamos la lista de contactos
        List<Contact> listContact = new ArrayList<Contact>();
        // añadimos los contactos a la lista de contactos
        listContact.add(papa);
        listContact.add(mama);
        //creamos un cliente con su lista de contactos
        Client client = new Client(me, listContact);

        // envio de un mensaje de un chat con otra persona
        ChatDuo chatConPapa = new ChatDuo(client.getMe(), client.getContactList().get(0));

        Text message = new Text(LocalDateTime.now(), "Buenos dias");
        Text message2 = new Text(LocalDateTime.now(), "COMO estas ");
        //validamos los mensajes
        message.validate();
        message2.validate();
        // enviamos los mensajes
        client.sendToContact(chatConPapa, message);
        client.sendToContact(chatConPapa, message2);
        //mostramos los mensajes de chatConPapa

        System.out.println("chatConPapa");


        for ( Message m : chatConPapa.getMessages()) {
            Text text = (Text) m;
            System.out.println(chatConPapa.getSender().getName() + " : "+ text.getMessage()) ;

        }

        // envio de mensaje a un chat grupal
        ChatGroup chatFamilia = new ChatGroup(client.getMe(), client.getContactList());

        Text message3 = new Text(LocalDateTime.now(), "Buenos dias familia");
        Text message4 = new Text(LocalDateTime.now(), "como estan");
        // validamos los mensajes
        message3.validate();
        message4.validate();
        // enviamos los mensajes
        client.sendToGroup(chatFamilia, message3);
        client.sendToGroup(chatFamilia, message4);


        //mostramos los mensajes de chatConfamilia
        System.out.println("chat con familia");
        for (Message m2 : chatFamilia.getMessages()) {
            Text text = (Text) m2;
            System.out.println(chatFamilia.getSender().getName() + " :  " + text.getMessage());
        }
    }

}
