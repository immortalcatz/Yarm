package com.unrealdinnerbone.yarm.Util;

import net.minecraft.util.text.translation.I18n;

public enum LangHelper {
    MESSAGE("message"),
    LABEL("label"),
    BLOCK("tile"),
    ITEM("item"),
    DESCRIPTION("description"),
    JEI("jei"),
    NONE(""),
    TAB("tab"),
    Achievement("achievement");

    private String name;

    LangHelper(String name) {
        this.name = name;
    }

    public String translateMessage(String message) {
        if (this.name == "")
            return I18n.translateToLocal(message);

        return I18n.translateToLocal(String.format("%s.%s.%s", this.name, Reference.MOD_ID, message + ""));
    }
}