package com.unrealdinnerbone.yarm.common.Containers.Panels.Night;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.common.config.ConfigPanels;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.ITeslaProducer;

public class ContainerNightPanelTeir1 implements ITeslaHolder, ITeslaProducer
{

    private long powerStored = 0;

    @Override
    public long getStoredPower () {

        return this.powerStored;
    }

    @Override
    public long getCapacity() {
        return ConfigPanels.NightPanelTeir1_Cap;
    }

    @Override
    public long takePower (long tesla, boolean simulated) {

        final long removedPower = Math.min(this.powerStored, Math.min(ConfigPanels.NightPanelTeir1_TranforRate, tesla));

        if (!simulated)
            this.powerStored -= removedPower;

        return removedPower;
    }
    public void generatePower () {

        this.powerStored += ConfigPanels.NightPanelTeir1_GenRate;

        if (this.powerStored > this.getCapacity())
            this.powerStored = this.getCapacity();
    }

    public void setPower(long power) {

        this.powerStored = power;
    }
}
