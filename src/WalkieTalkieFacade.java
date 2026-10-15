import subsystem.*;

public class WalkieTalkieFacade {
    private CloseCircuit circuit;
    private ActivateTransmitter transmitter;
    private ConvertVoiceToRadioSignal radioSignal;
    private TransmitSignal transmitSignal;

    public void Facade() {
        circuit = new CloseCircuit();
        transmitter = new ActivateTransmitter();
        radioSignal = new ConvertVoiceToRadioSignal();
        transmitSignal = new TransmitSignal();
    }

    public void Speak() {
        circuit.closeCircuit();
        transmitter.activateTransmitter();
        radioSignal.convertVoiceToRadioSignal();
        transmitSignal.transmitSignal();
        System.out.println("You Can Speak");
    }
}
