package com.in28minutes.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("going up");
	}
	public void down() {
		System.out.println("going down");
	}
	public void left() {
		System.out.println("going left");
	}
	public void right() {
		System.out.println("going right");
	}
}
