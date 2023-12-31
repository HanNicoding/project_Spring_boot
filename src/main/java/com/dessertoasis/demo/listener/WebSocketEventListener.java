package com.dessertoasis.demo.listener;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.dessertoasis.demo.model.websocket.ChatMessage;

@Component
public class WebSocketEventListener {

	@Autowired
	private SimpMessageSendingOperations messagingTemplate;
	
	@EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
        System.out.println("收到一個新的WebSocket連線");
    }
	
	@EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
		System.out.println("disconnect");
//        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
//
//        String username = (String) headerAccessor.getSessionAttributes().get("username");
//        if(username != null) {
//            System.out.println("使用者" + username + "已離線");
//
//            ChatMessage chatMessage = new ChatMessage();
//
//            messagingTemplate.convertAndSend("/topic/public", chatMessage);
//        }
    }
	
	@EventListener
	void handleSessionConnectedEvent(SessionConnectedEvent event) {
	    // Get Accessor
//	    StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());

	}
}
