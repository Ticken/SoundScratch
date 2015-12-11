package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.audio.Music;

import javafx.scene.media.MediaPlayer;

public class SoundTest extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	MediaPlayer mp;
	Music mbg;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		//http://stackoverflow.com/questions/4861859/implement-sound-in-android-application
		//http://developer.android.com/reference/android/media/MediaPlayer.html
		mbg = Gdx.audio.newMusic(Gdx.files.internal("Kedelaron Music.mp3"));
		mbg.setLooping(true);
		mbg.play();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
			if(mbg.isPlaying()) {
				mbg.stop();
			}
			else {
				mbg.play();
			}
		}
		if (Gdx.input.isTouched()) {
			if(mbg.isPlaying()) {
				mbg.stop();
			}
			else {
				mbg.play();
			}
		}

	}
}
