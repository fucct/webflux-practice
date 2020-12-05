package com.fucct.webfluxpractice.router;

public class Member {
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member : " + this.name;
    }
}
