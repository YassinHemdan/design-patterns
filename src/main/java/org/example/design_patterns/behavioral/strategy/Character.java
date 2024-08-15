package org.example.design_patterns.behavioral.strategy;

public abstract class Character {
    private WeaponBehaviour weaponBehaviour;
    public Character(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour){
        if(weaponBehaviour != null)
            this.weaponBehaviour = weaponBehaviour;
    }
    abstract void fight();
}
