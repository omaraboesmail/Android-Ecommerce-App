package com.OmarAboEsmail.e_commercev2.Pojo.category;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("_id")
    String category;

    String icon;

    public Category(String category, String icon) {
        this.category = category;
        this.icon = icon;
    }

    public String getCategory() {
        return category;
    }

    public String getIcon() {
        return icon;
    }
}
