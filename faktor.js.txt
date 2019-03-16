const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    var nums = line.split(' ');
    
    var art = parseInt(nums[0]);
    var imp = parseInt(nums[1]);
    var threshhold = imp-1;
    var i = 1;

    while(true){
        if(i / art > threshhold){
            console.log(i);
            return;
        }
        i++;
    }
});