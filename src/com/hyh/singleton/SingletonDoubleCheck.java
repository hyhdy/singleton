package com.hyh.singleton;

/**
 * 双重检查机制实现单例模式
 * @author hyh
 *
 */
public class SingletonDoubleCheck {
	//注意需要用volatile关键字修饰，思考一下why?
	private static volatile SingletonDoubleCheck mInstance;
	
	private SingletonDoubleCheck() {
		
	}
	
	public static SingletonDoubleCheck getInstance() {
		if(mInstance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if(mInstance == null) {
					mInstance = new SingletonDoubleCheck();
				}
			}
		}
		
		return mInstance;
	}
}
