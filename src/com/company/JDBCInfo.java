package com.company;

public enum JDBCInfo {
    DRIVER, URL, USERNAME, PASSNAME;

    public String getJDBCInfo(JDBCInfo info) {
        switch (info){
            case DRIVER:
                return "com.mysql.jdbc.Driver";
            case URL:
                return "jdbc:mysql://localhost:3306/db_database";
            case PASSNAME:
                return "mingsoft";
            case USERNAME:
                return "mr";
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        for (JDBCInfo info : JDBCInfo.values()){
            System.out.println(info + ":" + info.getJDBCInfo(info));
        }
    }
}
