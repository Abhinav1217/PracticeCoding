
let sum:number = 0;

for (let i=3; i < 10; i++){
    if (i%3 == 0){
        sum += i;
        continue;
    } else if ( i%5 == 0) {
        sum += i;
    }

}

console.log(sum);

