package com.hyh.singleton;

/**
 * 静态内部类实现单例模式
 * @author hyh
 *
 */
public class SingletonIodh {
	
	private SingletonIodh() {
		
	}
	
	private static class InnerClass{
		private static final SingletonIodh mInstance=new SingletonIodh();
	}
	
	public static SingletonIodh getInstance() {
		return InnerClass.mInstance;
	}

}
