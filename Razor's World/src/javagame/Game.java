package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.*;


public class Game extends StateBasedGame{

	public static final String gamename = "Razor's Game!";
	public static final int menu = 0;
	public static final int play = 1;
	
	public Game(String gamename){
		super(gamename);
		this.addState(new Menu(menu));		//Add State for menu
		this.addState(new Play(play));		//Add State for play
	}
	
	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(menu).init(gc, this);     //Initializes the states
		this.getState(play).init(gc, this);		//Initializes the states
		this.enterState(menu);					//Start with the menu state
		
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(640, 360, false);
			appgc.start();
		}catch(SlickException e){
			e.printStackTrace();
		}

	}

}
