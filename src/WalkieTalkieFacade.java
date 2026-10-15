import subsystem.*;

import javax.sound.midi.Transmitter;

public class WalkieTalkieFacade {
    private CloseCircuit circuit;
    private ActivateTransmitter transmitter;
    private ConvertVoiceToRadioSignal radioSignal;
    private TransmitSignal transmitSignal;

    public WalkieTalkieFacade(CloseCircuit circuit,  ActivateTransmitter transmitter, ConvertVoiceToRadioSignal radioSignal, TransmitSignal transmitSignal) {
        this.circuit = circuit;
        this.transmitter = transmitter;
        this.radioSignal = radioSignal;
        this.transmitSignal = transmitSignal;
    }

    public void Speak() {
        circuit.closeCircuit();
        transmitter.activateTransmitter();
        radioSignal.convertVoiceToRadioSignal();
        transmitSignal.transmitSignal();
        System.out.println("You Can Speak");
    }
}
