package com.company;


enum Size{
    SMALL, MEDIUM, LARGE;

}

public class EnumClass {
    public static void main(String[] args) {
        for (Size size : Size.values()){
            System.out.println(size + "的序数是：" + size.ordinal());
            System.out.println(size.compareTo(Size.SMALL));
            System.out.println(size.equals(Size.SMALL));
            System.out.println(size == Size.SMALL);
            System.out.println(size.name());
            System.out.println("***************");
        }
    }
}
