package com.unrealdinnerbone.yarm.common.blocks.Panels.Night;

import com.unrealdinnerbone.yarm.Util.MessageHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.client.gui.NightPanelGUI.GUINightPanel;
import com.unrealdinnerbone.yarm.common.Containers.Panels.Night.ContainerNightPanelTeir1;
import com.unrealdinnerbone.yarm.common.TileEnity.Panels.Night.TileEntityNightPanelTeir1;
import com.unrealdinnerbone.yarm.common.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.common.config.ConfigPanels;
import com.unrealdinnerbone.yarm.common.init.ModItems;
import com.unrealdinnerbone.yarm.compact.WAILA.WailaInfoProvider;
import com.unrealdinnerbone.yarm.compact.TOP.TOPInfoProvider;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import net.darkhax.tesla.api.ITeslaProducer;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class BlockNightPanelTeir1 extends BlockYarm implements ITileEntityProvider, WailaInfoProvider, TOPInfoProvider, ITeslaProducer
{

    private static String name = "BlockNightPanelTeir1";

    @Override
    public String getLocalizedName() {
        return null;
    }

    public BlockNightPanelTeir1() {

        super();
        this.isBlockContainer = true;
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setHardness(0.2F);
        this.setLightOpacity(0);
    }

    @Override
    public boolean onBlockActivated (World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

        if (worldIn.isRemote) {

            final TileEntity tile = worldIn.getTileEntity(pos);

            if (tile instanceof TileEntityNightPanelTeir1 && !tile.isInvalid()) {


                final TileEntityNightPanelTeir1 panel = (TileEntityNightPanelTeir1) tile;
                final ContainerNightPanelTeir1 container = (ContainerNightPanelTeir1) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);

                int Stored = (int) container.getStoredPower();
                int Cap = (int) container.getCapacity();


                // MessageHelper.sendSpamlessMessage(617698741, new TextComponentString(String.format(Stored + "/"  + Cap + "T", container.getStoredPower(), container.getCapacity(), ConfigPanels.NightPanelTeir1_GenRate)));
            }
        }
        if (!worldIn.isRemote) {
            final TileEntity tile = worldIn.getTileEntity(pos);

            if (tile instanceof TileEntityNightPanelTeir1 && !tile.isInvalid()) {

                final TileEntityNightPanelTeir1 panel = (TileEntityNightPanelTeir1) tile;
                final ContainerNightPanelTeir1 container = (ContainerNightPanelTeir1) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);

                int Stored = (int) container.getStoredPower();
                int Cap = (int) container.getCapacity();

                GUINightPanel.Stored = Stored;
                Minecraft.getMinecraft().displayGuiScreen(new GUINightPanel());
            }
        }

        return true;
    }

    @Override
    public void breakBlock (World worldIn, BlockPos pos, IBlockState state) {

        super.breakBlock(worldIn, pos, state);
        final TileEntity tileentity = worldIn.getTileEntity(pos);
        worldIn.removeTileEntity(pos);

    }

    @Override
    public boolean eventReceived (IBlockState state, World worldIn, BlockPos pos, int id, int param) {

        super.eventReceived(state, worldIn, pos, id, param);
        final TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }

    @Override
    public TileEntity createNewTileEntity (World worldIn, int meta) {

        return new TileEntityNightPanelTeir1();
    }

    public static String getName()
    {
        return name;
    }

    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        TileEntity te = world.getTileEntity(data.getPos());
        if (te instanceof TileEntityNightPanelTeir1)
        {
            final TileEntityNightPanelTeir1 panel = (TileEntityNightPanelTeir1) te;
            final ContainerNightPanelTeir1 container = (ContainerNightPanelTeir1) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);


            probeInfo.horizontal().text(container.getStoredPower() + "T" +"/" + container.getCapacity());

            probeInfo.horizontal(probeInfo.defaultLayoutStyle().borderColor(0xffff454))
                    .progress(container.getStoredPower(), container.getCapacity(), probeInfo.defaultProgressStyle().suffix("T"));
        }
    }

    @Override
    public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        TileEntity te = accessor.getTileEntity();
        if (te instanceof TileEntityNightPanelTeir1) {

            final TileEntityNightPanelTeir1 panel = (TileEntityNightPanelTeir1) te;
            final ContainerNightPanelTeir1 container = (ContainerNightPanelTeir1) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);

            TileEntityNightPanelTeir1 dataTileEntity = (TileEntityNightPanelTeir1) te;

            double Max = container.getCapacity();
            double Stored = container.getStoredPower();
            double Precent = (Stored/Max) * 100;

            currenttip.add(container.getStoredPower() + "T" + "/" + container.getCapacity() + "T (" + Precent + "%)");
        }
        return currenttip;
    }

    @Override
    public long takePower(long power, boolean simulated) {

        return power;
    }
}
