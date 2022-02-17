package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность MAGIC DAMAGE");

    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}
