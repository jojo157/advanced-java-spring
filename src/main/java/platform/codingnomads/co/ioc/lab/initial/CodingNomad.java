package platform.codingnomads.co.ioc.lab.initial;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import platform.codingnomads.co.ioc.lab.completed.SoundSystem;

import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class CodingNomad {

    private final JDK jdk;
    private final IDE ide;
    private final Framework framework;
    private SoundSystem soundSystem;
    @Autowired
    private Computer computer;

    @Autowired
    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public String createAwesomeSoftware() {
        return MessageFormat
                .format("This coding nomad is creating awesome software using, " +
                                "IDE: ({0}:{1}), JDK: ({2}:{3}), Framework: ({4}:{5}), " +
                                "Computer: ({6}:{7}), Sound System: ({8}:{9})",
                        ide.getName(),
                        ide.getVersion(),
                        jdk.getName(),
                        jdk.getVersion(),
                        framework.getName(),
                        framework.getVersion(),
                        computer.getName(),
                        computer.getVersion(),
                        soundSystem.getBrand(),
                        soundSystem.getType()
                );
    }
}
