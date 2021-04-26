package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.*;

public class MyGdxGame extends Game {

	public void create() {
		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render();
	}

	public void dispose() {

	}
}
