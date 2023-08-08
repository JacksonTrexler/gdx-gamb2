package com.trex.gdxgamb2;

import java.util.Iterator;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

public class GameScreen implements Screen{
    final GdxGamb2 game;
    public GameScreen(final GdxGamb2 game){
        this.game = game;
    }
    @Override
    public void render(float delta){
        ScreenUtils.clear(0, 0, 0.2f, 1);
    }

    @Override
    public void dispose(){

    }
    @Override
    public void resize(int width, int height) {
    }
    @Override
    public void show() {
        //Screen is shown
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }
}
