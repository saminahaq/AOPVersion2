package com.in28minutes.token.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;
import com.in28minutes.model.Token;

@Service
public class TokenService {
	private static List<Token> tokens = new ArrayList<Token>();
	private static int todoCount = 3;

	static {
		tokens.add(new Token(1, "in28Minutes", "Learn Spring MVC", new Date(),
				false));
		tokens.add(new Token(2, "in28Minutes", "Learn Struts", new Date(), false));
		tokens.add(new Token(3, "in28Minutes", "Learn Hibernate", new Date(),
				false));
	}

	
	

	public List<Token> retrieveTokens(String user) {
		List<Token> filteredTokes = new ArrayList<Token>();
		for (Token token : tokens) {
			if (token.getUser().equals(user))
				filteredTokes.add(token);
		}
		return filteredTokes;
	}

	public Token retrieveToken(int id) {
		for (Token token : tokens) {
			if (token.getId() == id)
				return token;
		}
		return null;
	}

	public void updateToken(Token token) {
		tokens.remove(token);
		tokens.add(token);
	}

	public void addToken(String name, String desc, Date targetDate,
			boolean isDone) {
		tokens.add(new Token(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteToken(int id) {
		Iterator<Token> iterator = tokens.iterator();
		while (iterator.hasNext()) {
			Token todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	
	public void showTodo(String name, String desc, Date targetDate,
			boolean isDone) {
		tokens.toString();
	}
	
	
	
	
	public void tokenfun()
	{
		System.out.println("token");
	}
	
	
	
	public void certificateList()
	{
		System.out.println("certficate");
	}
	
}