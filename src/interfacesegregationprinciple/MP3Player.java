package interfacesegregationprinciple;

public class MP3Player implements MediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("Audio is playing...");
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void stopAudio() {
        System.out.println("Audio is stopped...");
    }

    @Override
    public void stopVideo() {

    }

    @Override
    public void adjustAudioVolume() {
        System.out.println("Volume adjusted...");
    }

    @Override
    public void adjustVideoBrightness() {

    }
}
