package com.jspiders.builderdesignpattern.main;

import com.jspiders.builderdesignpattern.builder.ContactBuilder;
import com.jspiders.builderdesignpattern.object.Contact;

public class ContactMain {
public static void main(String[] args) {
		
		Contact contact = new ContactBuilder().last_name("souri")
							.getContact();
		System.out.println(contact);
	}
}
