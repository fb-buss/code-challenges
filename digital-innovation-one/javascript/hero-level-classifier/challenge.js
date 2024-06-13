let heroes = [
    { name: "Tanjiro", exp: 11000 },
    { name: "Nezuko", exp: 8500 },
    { name: "Inosuke", exp: 8000 }
];

const rankings = [
    { name: "Iron", minExp: 0, maxExp: 3000 },
    { name: "Silver", minExp: 3001, maxExp: 5000 },
    { name: "Gold", minExp: 5001, maxExp: 7000 },
    { name: "Ascendant", minExp: 7001, maxExp: 8000 },
    { name: "Immortal", minExp: 8001, maxExp: 9000 },
    { name: "Radiant", minExp: 9001, maxExp: Infinity }
];

for (const hero of heroes) {
    for (const ranking of rankings) {
        if (hero.exp >= ranking.minExp && hero.exp <= ranking.maxExp) {
            console.log(`The hero ${hero.name} is at the rank ${ranking.name}.`);
        }
    }
}
