package com.unrealdinnerbone.yarm.common.config;

import static com.unrealdinnerbone.yarm.common.config.ConfigManger.*;

public class ClientConfig
{
    public static boolean playerRoating;
    public static boolean playerCapes;

    public static void loadClientConfig()
    {
        clientConfig.setCategoryLanguageKey(client, "config.client");
        ClientConfig.playerRoating = clientConfig.getBoolean("Spin Players", client, true, "Do players on the list get seined", client);
        ClientConfig.playerCapes = clientConfig.getBoolean("Render Capes", client, true, "Do players capes render", client);

        if (clientConfig.hasChanged())
        {
            clientConfig.save();
        }
    }
}
