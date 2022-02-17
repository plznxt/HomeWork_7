package com.company;

public class Medic extends Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность SUPER HEAL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность SUPER HEAL");
    }
}
