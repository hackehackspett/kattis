const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    var nums = line.split(' ');
    if(isNaN(nums[0])){
        return;
    }
    var n = parseInt(nums[0]);
    var p = parseInt(nums[1]);
    console.log(p);
});