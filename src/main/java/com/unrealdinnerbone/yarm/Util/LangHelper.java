package com.unrealdinnerbone.yarm.Util;

import net.minecraft.util.text.translation.I18n;

public enum LangHelper {
    TAB("tab"),
    Achievement("achievement"),
    Banner("Banner"),
    Block("Block");

    private String name;

    LangHelper(String name)
    {
        this.name = name;
    }

    public String translateMessage(String message) {
        if (this.name == "")
            return "YARM" + I18n.translateToLocal(message);

        return I18n.translateToLocal(String.format("%s.%s.%s", this.name, Reference.MOD_ID, message + ""));
    }
}