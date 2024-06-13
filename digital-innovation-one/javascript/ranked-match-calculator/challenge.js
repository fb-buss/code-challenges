const players = [
    { name: "Jett", numVictories: 100, numDefeats: 5 },
    { name: "Deadlock", numVictories: 80, numDefeats: 15 },
    { name: "Sage", numVictories: 90, numDefeats: 22 }
];

const rankings = [
    { name: "Iron", minVictories: 0, maxDefeats: 10 },
    { name: "Silver", minVictories: 11, maxDefeats: 20 },
    { name: "Gold", minVictories: 21, maxDefeats: 40 },
    { name: "Ascendant", minVictories: 41, maxDefeats: 60 },
    { name: "Immortal", minVictories: 61, maxDefeats: 90 },
    { name: "Radiant", minVictories: 91, maxDefeats: Infinity }
];

for (const player of players) {
    let victoriesBalance = calculateVictoriesBalance(player.numVictories, player.numDefeats);
    const playerRanking = calculatePlayerRanking(victoriesBalance, rankings);
    console.log(`${player.name} has ${victoriesBalance} wins and is at the ${playerRanking} level.`);
}

function calculatePlayerRanking(victoriesBalance, rankings) {
    for (const ranking of rankings) {
        if (victoriesBalance >= ranking.minVictories && victoriesBalance <= ranking.maxDefeats) {
            return ranking.name;
        }
    }
}

function calculateVictoriesBalance(numVictories, numDefeats) {
    return numVictories - numDefeats;
}
