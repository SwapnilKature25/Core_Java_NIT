package com.nit.interfaces.day3;

interface MediaPlayer
{
	void play();
	void stop();
}

interface AdvancedMediaPlayer extends MediaPlayer
{
	public void pause();
}

class MusicPlayer implements AdvancedMediaPlayer
{
	String title;
	
	public MusicPlayer(String title) {
		super();
		if(this.title.equals(null))
		{
			System.out.println("Title is not be empty string.");
		}
		else this.title = title;
	}

	@Override
	public void play() {
		System.out.println("playing music :"+this.title);
	}

	@Override
	public void stop() {
		System.out.println("music Stopped  : "+this.title);
		
	}

	@Override
	public void pause() {
		System.out.println(" music paused : "+this.title);
		
	}
}


class VideoPlayer implements AdvancedMediaPlayer
{

	String titile;
	
	public VideoPlayer(String titile) {
		super();
		if(this.titile.equals(null))
		{
			System.out.println("Title is not be empty string.");
		}
		else this.titile = titile;
	}
	@Override
	public void play() {
		System.out.println("playing Video : "+this.titile);
	}

	@Override
	public void stop() {
		System.out.println("Video Stopped  : "+this.titile);
		
	}

	@Override
	public void pause() {
		System.out.println(" Video paused : "+this.titile);
		
	}
}

public class TestPlayer {
	public static void main(String[] args) {
		MusicPlayer mp=new MusicPlayer("Life");
		mp.play();
		mp.pause();
		mp.stop();
		
		VideoPlayer vp=new VideoPlayer("");
		vp.play();
		vp.pause();
		vp.stop();
	}
}
