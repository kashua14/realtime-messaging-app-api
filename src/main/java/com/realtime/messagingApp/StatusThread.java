package com.realtime.messagingApp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.realtime.messagingApp.model.User;
import com.realtime.messagingApp.repository.UserRepository;

public class StatusThread implements Runnable
{
	@Autowired
    UserRepository userRepository;
	
//	User user;
	String email;

	public StatusThread(String email) {
		this.email = email;
		Thread t = new Thread();
//		System.out.println(userRepository.findByEmail(this.email));
		t.start();
	}
	
	public void run() 
	{
		while(true) 
		{
			Optional<User> user = userRepository.findByEmail(email);
			System.out.println(user.toString());
//			user.setStatus("Active"); 
//			if(messagesRepository.existsByCreatedAt(LocalDateTime.now()))
//			{
//				msg.getContent();
//				System.out.println(msg.getContent());
//				try { wait(); } catch(Exception e) {}
//				System.out.println(msg.getContent());
//			}
			
		}
		
	}

}
