/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.init;

import toughasnails.api.temperature.TemperatureHelper;
import toughasnails.temperature.TemperatureHelperImpl;

public class ModApi
{
    public static void init()
    {
        TemperatureHelper.Impl.INSTANCE = new TemperatureHelperImpl();
    }
}
