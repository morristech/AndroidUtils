package com.example.user.utils.weight.animator;

public class AnimationFactory {
	public static AnimationFactory factory;
	
	public static AnimationFactory	getInstance(){
		if(factory==null){
			return new AnimationFactory();
		}else{
			return factory;
		}
	} 
	
	public AnimationEngine createEngine(){
		return new AnimationEngine();
	}
	
}
