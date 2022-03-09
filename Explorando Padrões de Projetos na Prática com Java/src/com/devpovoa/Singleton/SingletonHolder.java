package com.devpovoa.Singleton;

/**
 * Singleton "terceira forma".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Stackoverflow</a>
 * 
 * @author DevPovoa
 */
public class SingletonHolder {

	private static class InstanceHolder {
		public static SingletonHolder instancia = new SingletonHolder();
	}

	private SingletonHolder() {
		super();
	}

	public static SingletonHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
