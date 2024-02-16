package Interfaces.Question3;

interface AudioPlayer {
    public void play();
}

interface VideoPlayer {
    public void play();
}

class MP3Player implements AudioPlayer {
    public void play() {
        System.out.println("Playing mp3 file");
    }
}

class MP4Player implements VideoPlayer {
    public void play() {
        System.out.println("Playing mp4 file");
    }
}
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new MP3Player();
        audioPlayer.play();
        VideoPlayer videoPlayer = new MP4Player();
        videoPlayer.play();
    }
}
