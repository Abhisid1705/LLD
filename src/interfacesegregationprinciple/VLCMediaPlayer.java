package interfacesegregationprinciple;

public class VLCMediaPlayer implements AudioPlayer ,VideoPlayer{
    @Override
    public void playAudio() {
        System.out.println("Audio is playing...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }

    @Override
    public void stopAudio() {
        System.out.println("Audio is stopped...");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping Video...");
    }

    @Override
    public void adjustAudioVolume() {
        System.out.println("Volume adjusted...");
    }

    @Override
    public void adjustVideoBrightness() {
        System.out.println("Adjust brightness....");
    }
}
