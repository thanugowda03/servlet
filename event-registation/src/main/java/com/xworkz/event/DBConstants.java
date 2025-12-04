package com.xworkz.event;

public enum DBConstants {
    URL("jdbc:mysql://localhost:3306/event"),
    USERNAME("root"),
    Secret("tanu@123");
    private String prop;

    DBConstants(String prop){

        this.prop=prop;
    }

    public String getProp() {
        return prop;
    }
}
