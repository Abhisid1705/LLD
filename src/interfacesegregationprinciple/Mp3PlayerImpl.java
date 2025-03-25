package interfacesegregationprinciple;

public class Mp3PlayerImpl implements AudioPlayer{
    @Override
    public void stopAudio() {
        System.out.println("Stopping Audio...");
    }

    @Override
    public void playAudio() {
        System.out.println("Playing Audio...");
    }

    @Override
    public void adjustAudioVolume() {
        System.out.println("Adjusting  Audio volume ...");
    }
}
