package com.codingsense.behaivoral.adapter;

public class Main {

	public static void main(String[] args) {

		MediaPlayer mediaPlayer = new AudioPlayer();
		mediaPlayer.play("mp3", "filename");
		mediaPlayer.play("mp4", "filename");
		mediaPlayer.play("vlc", "filename");
	}

}
