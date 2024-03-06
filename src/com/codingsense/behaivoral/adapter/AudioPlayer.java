package com.codingsense.behaivoral.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String mediaType, String filename) {
		if (mediaType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing: " + mediaType + " from: " + filename);
		} else if (mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(mediaType);
			mediaAdapter.play(mediaType, filename);
		}
	}
}
