package com.company;

enum Size1 {

    SMALL("我是小号披萨"),
    MEDIUM("我是中号披萨"),
    LARGE("我是大号披萨");


    private String description;
    private Size1(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for (Size1 size : Size1.values()){
            System.out.println(size + ":" + size.getDescription());
        }
    }
}
