package com.devpovoa.Singleton;

/**
 * Singleton "primeira forma".
 * 
 * @author DevPovoa
 */
public class Singleton {

	private static Singleton instancia;

	private Singleton() {
		super();
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
