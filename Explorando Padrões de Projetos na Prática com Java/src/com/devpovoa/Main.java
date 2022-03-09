package com.devpovoa;

import com.devpovoa.Facade.Facade;
import com.devpovoa.Singleton.Singleton;
import com.devpovoa.Singleton.SingletonEager;
import com.devpovoa.Singleton.SingletonHolder;
import com.devpovoa.Strategy.Behavior;
import com.devpovoa.Strategy.BehaviorAggressive;
import com.devpovoa.Strategy.BehaviorCommon;
import com.devpovoa.Strategy.BehaviorDefensive;
import com.devpovoa.Strategy.Robo;

public class Main {

	public static void main(String[] args) {
		
		//Singleton.
		
		Singleton singleton = Singleton.getInstancia();
		System.out.println(singleton);
		singleton = Singleton.getInstancia();
		System.out.println(singleton);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonHolder holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		
		//Strategy.
		
		Behavior normal = new BehaviorCommon();
		Behavior defensivo = new BehaviorDefensive();
		Behavior agressivo = new BehaviorAggressive();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		
		//Facade.
		
		Facade facade = new Facade();
		facade.migrarCliente("Thiago", "24860-100");
	}

}
