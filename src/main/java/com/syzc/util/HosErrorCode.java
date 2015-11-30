package com.syzc.util;

import org.apache.log4j.Level;

public enum HosErrorCode {
    A(202, Level.TRACE);

    HosErrorCode(int i, Level level) {
        this.code = i;
        this.level = level;
    }

    private int code;
    private Level level;

    public int getCode() {
        return code;
    }

    public Level getLevel() {
        return level;
    }

    public static void main(String[] args) {
        System.out.println(com.syzc.sseip.util.HosErrorCode.A.code);
        System.out.println(com.syzc.sseip.util.HosErrorCode.A.level);
        System.out.println(com.syzc.sseip.util.HosErrorCode.A);
    }
}