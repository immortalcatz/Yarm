package com.unrealdinnerbone.yarm.Util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.stream.JsonReader;

import net.darkhax.bookshelf.lib.util.RenderUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

/**
 * TAKEN FOR BOOKSHELF MOD
 *
 * This class is used to handle my supporters data. This class is not intended for other mod
 * authors to access in their code. If you want, you can copy and modify this code to add
 * support for your own supporters and rewards.
 */
public class StatsGetter {

    private static final ResourceLocation MISSING_CAPE = new ResourceLocation(Reference.RE_PREFIX_, "textures/entity/player/missing_cape.png");
    private static final ResourceLocation MISSING_ELYTRA = new ResourceLocation(Reference.RE_PREFIX_, "textures/entity/player/missing_elytra.png");

    private static final List<SupporterData> DATA = new ArrayList<SupporterData>();
    private static final String SUPPORTER_URL = "https://raw.githubusercontent.com/UnRealDinnerbone/Yarm/" + Reference.MC_VERSION + "/Files/Players/People.json";

    public static void ReadPepsData() {

        try {

            // Reads the json file and makes it usable.
            final HttpURLConnection connection = (HttpURLConnection) new URL(SUPPORTER_URL).openConnection();
            final JsonReader reader = new JsonReader(new InputStreamReader((InputStream) connection.getContent()));

            reader.beginObject();

            // Starts a loop through all of the player entries.
            while (reader.hasNext()) {

                // Gets the name of the next player entry and skips it.
                reader.nextName();
                // final String entryName = reader.nextName();

                UUID playerID = null;
                String type = null;
                boolean confirmed = false;
                String elytraTexture = null;
                String capeTexture = null;

                // Opens up the player entry object
                reader.beginObject();

                // Loops through the values in the newly opened object
                while (reader.hasNext()) {

                    final String name = reader.nextName();

                    if (name.equals("playerID"))
                        playerID = UUID.fromString(reader.nextString());

                    else if (name.equals("type"))
                        type = reader.nextString();

                    else if (name.equals("confirmed"))
                        confirmed = reader.nextBoolean();

                    else if (name.equals("elytraTexture"))
                        elytraTexture = reader.nextString();

                    else if (name.equals("capeTexture"))
                        capeTexture = reader.nextString();

                        // Skips values we don't care about so they don't break us.
                    else
                        reader.skipValue();
                }

                // Adds the data that was read to the list.
                DATA.add(new SupporterData(playerID, type, confirmed, elytraTexture, capeTexture));

                // Ends the current player object, allowing us to read the next player object.
                reader.endObject();
            }

            // Exits out of the json array.
            reader.endObject();

            // Closes the reader.
            reader.close();
        }

        catch (final MalformedURLException e) {

            e.printStackTrace();
            LogHelper.info(e.getCause());
        }

        catch (final IOException e) {

            e.printStackTrace();
            LogHelper.info(e.getCause());
        }
    }

    /**
     * Checks if a player is a valid supporter supporter.
     *
     * @param player The player to check for.
     * @return Whether or not the player is a supporter.
     */
    public static boolean isSupporter (EntityPlayer player) {

        for (final SupporterData supporter : DATA)
            if (supporter.getPlayerID().equals(player.getUniqueID()))
                return true;

        return false;
    }

    /**
     * Attempts to get the supporterData for a player.
     *
     * @param player The player to get data for.
     * @return The supporter data, or null if the player is not a supporter.
     */
    public static SupporterData getSupporterData (EntityPlayer player) {

        for (final SupporterData supporter : DATA)
            if (supporter.getPlayerID().equals(player.getUniqueID()))
                return supporter;

        return null;
    }

    public static class SupporterData {

        /**
         * The unique identifier for the supporter player.
         */
        private final UUID PLAYER_ID;

        /**
         * The type of supporter. Currently supports dev, patreon and contributor.
         */
        private final String TYPE;

        /**
         * Whether or not this supporter has completed a payment.
         */
        private final boolean CONFIRMED;

        /**
         * The URL for the custom Elytra texture.
         */
        private final String ELYTRA_TEXTURE;

        /**
         * The URL for the cape texture for the supporter.
         */
        private final String CAPE_TEXTURE;

        protected SupporterData(UUID playerID, String type, boolean confirmed, String elytraTexture, String capeTexture) {

            this.PLAYER_ID = playerID;
            this.TYPE = type;
            this.CONFIRMED = confirmed;
            this.ELYTRA_TEXTURE = elytraTexture;
            this.CAPE_TEXTURE = capeTexture;
        }

        /**
         * Gets the supporter's unique identifier.
         *
         * @return The supporter's unique identifier.
         */
        public UUID getPlayerID () {

            return this.PLAYER_ID;
        }

        /**
         * Checks if the supporter has completed a payment.
         *
         * @return Whether or not the supporter has completed a payment.
         */
        public boolean isConfirmed () {

            return this.CONFIRMED;
        }


        /**
         * Gets the URL for the custom Cape texture for the supporter.
         *
         * @return A url that points to the custom Cape texture that the supporter wants.
         */
        public String getCapeTextureURL () {

            return this.CAPE_TEXTURE;
        }

        /**
         * Gets the URL for the custom Elytra texture for the supporter.
         *
         * @return A url that points to the custom Elytra texture that the supporter wants.
         */
        public String getElytraTextureURL () {

            return this.ELYTRA_TEXTURE;
        }

        /**
         * Gets the custom Cape texture for the supporter.
         *
         * @return A ResourceLocation that points to the custom Cape texture that the supporter
         *         wants.
         */
        public ResourceLocation getCapeTexture () {

            return this.CAPE_TEXTURE != null && !this.CAPE_TEXTURE.isEmpty() ? RenderUtils.downloadResourceLocation(this.CAPE_TEXTURE, new ResourceLocation("bookshelf", "cape/" + this.PLAYER_ID.toString()), MISSING_CAPE, null) : null;
        }

        /**
         * Gets the custom Elytra texture for the supporter.
         *
         * @return A ResourceLocation that points to the custom Elytra texture that the
         *         supporter wants.
         */
        public ResourceLocation getElytraTexture () {

            return this.ELYTRA_TEXTURE != null && !this.ELYTRA_TEXTURE.isEmpty() ? RenderUtils.downloadResourceLocation(this.ELYTRA_TEXTURE, new ResourceLocation("bookshelf", "elytra/" + this.getPlayerID().toString()), MISSING_ELYTRA, null) : null;
        }

        /**
         * Gets the type of supporter. Currently dev, contributor, patreon and other.
         *
         * @return The type of supporter.
         */
        public String getType () {

            return this.TYPE;
        }
    }
}