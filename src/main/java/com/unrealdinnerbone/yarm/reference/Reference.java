package com.unrealdinnerbone.yarm.reference;


public class Reference
{
    public static final String MOD_ID = "yarm";
    public static final String MOD_NAME = "Yet Another Random Mod - YARM";
    public static final String VERSION = "@VERSION@";
    public static final String MC_VERSION = "1.8.9";
    public static final String SERVER_SIDE = "com.unrealdinnerbone.yarm.proxy.ServerProxy";
    public static final String CLIENT_SIDE = "com.unrealdinnerbone.yarm.proxy.ClientProxy";

    public static final String RE_PREFIX = MOD_ID.toLowerCase() + ":";
    public static final String TEXTURE_PATH_ITEM = RE_PREFIX + "items/";
    public static final String TEXTURE_PATH_BLOCK = RE_PREFIX + "blocks/";
    public static final String MOD_DISPLAY_NAME_WITH_VERSION = MOD_ID.toUpperCase() + VERSION;
}
