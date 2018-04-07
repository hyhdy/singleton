package com.hyh.singleton;

/**
 * 饿汉式
 * @author hyh
 *
 */
public class SingletonHungry {
	private static final SingletonHungry mInstance=new SingletonHungry();
	
	private SingletonHungry() {
		
	}
	
	public static SingletonHungry getInstance() {
		return mInstance;
	}
}
