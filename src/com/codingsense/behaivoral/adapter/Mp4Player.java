package com.codingsense.behaivoral.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String filename) {
		System.out.println("playing: mp4 from: " + filename);
	}

}
