package Multiple_MediaPlayable_SmartDevice_SmartSpeaker;

public class SmartSpeaker implements MediaPlayable,SmartDevice{
	
	void voiceAssistant()
	{
		System.out.println("Listening for commands...");
	}

	@Override
	public void connectToWiFi() {
		System.out.println("Connected to WIFI....");
		
	}

	@Override
	public void playMusic() {
		
		System.out.println("Playing Music....");
		
	}

}
