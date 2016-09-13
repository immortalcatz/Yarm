package com.unrealdinnerbone.yarm.common.TileEnity.Panels.Night;

import com.unrealdinnerbone.yarm.common.Containers.Panels.Night.ForgePowerTest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;

public class TileEntityNightPanelTeir2 extends TileEntity implements ITickable
{

    private final ForgePowerTest container;

    public TileEntityNightPanelTeir2() {

        this.container = new ForgePowerTest(10000,100,100);
    }

    @Override
    public void update () {

        if (this.hasWorldObj())
        {

            //Todo Test to see if it's night or in no skyworld
//            if (this.worldObj.canBlockSeeSky(this.pos.offset(EnumFacing.UP)) && !this.worldObj.isRaining() && this.worldObj.getSkylightSubtracted() == 0 && this.container.getStoredPower() != this.container.getCapacity()))
              this.container.getEnergyStored();
        }
    }

    @Override
    public void readFromNBT (NBTTagCompound compound) {

        super.readFromNBT(compound);
        this.container.setPower(compound.getInteger("StoredPower"));
    }

    @Override
    public NBTTagCompound writeToNBT (NBTTagCompound compound) {

        compound.setInteger("StoredPower", this.container.getEnergyStored());
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


}
