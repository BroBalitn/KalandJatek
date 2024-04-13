package StartBeallitasok;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Zene {
    public void hatterZene() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        Clip c = AudioSystem.getClip();
        AudioInputStream ais = AudioSystem.getAudioInputStream(new File("src/bg_music.wav"));
        c.open(ais);
        FloatControl fc = (FloatControl) c.getControl(FloatControl.Type.MASTER_GAIN);
        fc.setValue(-20.0f);
        c.loop(Clip.LOOP_CONTINUOUSLY);
    }
}
