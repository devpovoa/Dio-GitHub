package com.devpovoa.Singleton;

/**
 * Singleton "segunda forma".
 * 
 * @author DevPovoa
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
