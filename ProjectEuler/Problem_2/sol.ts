let sum:number = 0;

let first:number = 1;
let second:number = 2;
while (second < 1_00) {

    if (second % 2 == 0) {
        sum += second;
        // console.log(` first = ${first} second = ${second} `);
    }
    second = first + second;
    first = second - first;
}

console.log(sum);
