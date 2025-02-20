package toughasnails.api.player;

import toughasnails.api.temperature.ITemperature;

public interface ITANPlayer
{
    ITemperature getTemperatureData();
    boolean getClimateClemencyGranted();
    void setClimateClemencyGranted(boolean value);
}
