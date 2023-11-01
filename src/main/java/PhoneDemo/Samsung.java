package PhoneDemo;
class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
