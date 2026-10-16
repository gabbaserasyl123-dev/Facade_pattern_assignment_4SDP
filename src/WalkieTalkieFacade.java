import subsystem.*;

public class WalkieTalkieFacade {

    circuit = new CloseCircuit();
    transmitter = new ActivateTransmitter();
    radioSignal = new ConvertVoiceToRadioSignal();
    transmitSignal = new TransmitSignal();

    public void Speak() {
        circuit.closeCircuit();
        transmitter.activateTransmitter();
        radioSignal.convertVoiceToRadioSignal();
        transmitSignal.transmitSignal();
        System.out.println("\nYou Can Speak");
    }
}
