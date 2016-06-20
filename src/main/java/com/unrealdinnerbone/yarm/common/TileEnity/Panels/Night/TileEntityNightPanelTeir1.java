package com.unrealdinnerbone.yarm.common.TileEnity.Panels.Night;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.common.Containers.Panels.Night.ContainerNightPanelTeir1;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

import net.minecraftforge.common.capabilities.Capability;

public class TileEntityNightPanelTeir1 extends TileEntity implements ITickable
{

    private final ContainerNightPanelTeir1 container;

    public TileEntityNightPanelTeir1() {

        this.container = new ContainerNightPanelTeir1();
    }

    @Override
    public void update () {

        if (this.hasWorldObj())
        {

            //Todo Test to see if it's night or in no skyworld
//            if (this.worldObj.canBlockSeeSky(this.pos.offset(EnumFacing.UP)) && !this.worldObj.isRaining() && this.worldObj.getSkylightSubtracted() == 0 && this.container.getStoredPower() != this.container.getCapacity()))
              this.container.generatePower();
        }
    }

    @Override
    public void readFromNBT (NBTTagCompound compound) {

        super.readFromNBT(compound);
        this.container.setPower(compound.getLong("StoredPower"));
    }

    @Override
    public NBTTagCompound writeToNBT (NBTTagCompound compound) {

        compound.setLong("StoredPower", this.container.getStoredPower());
        return super.writeToNBT(compound);
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket () {

        return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
    }

    @Override
    public void onDataPacket (NetworkManager net, SPacketUpdateTileEntity packet) {

        super.onDataPacket(net, packet);
        this.readFromNBT(packet.getNbtCompound());
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability (Capability<T> capability, EnumFacing facing) {

        if (facing == EnumFacing.DOWN && (capability == TeslaCapabilities.CAPABILITY_PRODUCER || capability == TeslaCapabilities.CAPABILITY_HOLDER))
            return (T) this.container;

        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability (Capability<?> capability, EnumFacing facing) {

        if (facing == EnumFacing.DOWN && (capability == TeslaCapabilities.CAPABILITY_PRODUCER || capability == TeslaCapabilities.CAPABILITY_HOLDER))
            return true;

        return super.hasCapability(capability, facing);
    }

}
