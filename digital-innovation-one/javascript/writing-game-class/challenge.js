class Hero {
    constructor(heroName, heroAge, heroClass) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroClass = heroClass;
    }

    getDamageType() {
        let damageType;
        switch (this.heroClass) {
            case "Mage":
                damageType = "Magic Damage";
                break;
            case "Warrior":
                damageType = "Physical Damage";
                break;
            case "Monk":
                damageType = "Impact Damage";
                break;
            case "Ninja":
                damageType = "Stealth Damage";
                break;
            default:
                damageType = "Unknown Damage";
        }   
        return damageType;
    }
}

let heroes = [
    new Hero("Dark Wizard", 88, "Mage"),
    new Hero("Blade Knight", 33, "Warrior"),
    new Hero("Sage Fist", 122, "Monk"),
    new Hero("Shadow Silent", 22, "Ninja")
];

for (const hero of heroes) {
    console.log(`Hero: ${hero.heroName}\nClass: ${hero.heroClass}\nDamage: ${hero.getDamageType()}\n`);
}
