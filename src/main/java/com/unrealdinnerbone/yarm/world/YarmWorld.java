package com.unrealdinnerbone.yarm.world;

import com.unrealdinnerbone.yarm.world.OreManganite;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class YarmWorld {
    public static void mainRegistery()
    {
        initialiseWorldGen();
    }
    public static void initialiseWorldGen()
    {
        registerWorldGen(new OreManganite(), 1);
    }
    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, 1);
    }
}
