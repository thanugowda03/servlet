package com.xworkz.jdbc;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/matrimony"+"?useSSL=false"),
    USERNAME("root"),
    Secret("tanu@123");
    private String prop;

    DBConstant(String prop){

        this.prop=prop;
    }

    public String getProp() {
        return prop;
    }
}
