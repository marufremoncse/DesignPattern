package com.codingsense.behaivoral.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
	@Override
	public void playVlc(String filename) {
		System.out.println("playing: vlc from: " + filename);
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
	}
}
