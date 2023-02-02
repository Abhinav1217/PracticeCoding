// In this scenario, TS is just JS with strict typings.

function sockMerchant(n: number, ar: number[]):number{
    const sock_pile: Set<number> = new Set();
    let counter: number = 0;

    ar.forEach(sock => {
        if (sock_pile.has(sock)){
            counter++;
            sock_pile.delete(sock);
        } else {
            sock_pile.add(sock);
        }
    });

    return counter;
}


function main(){


    let n: number;
    let ar: number[];

    console.log("\nScenario 0: ");
    n = 9;
    ar = [10,20,20,10,10,30,50,10,20];
    console.log(`${sockMerchant(n, ar)} \n`); // 3;

    console.log("\nScenario 1: ");
    n = 7;
    ar = [1,2,1,2,1,3,2];
    console.log(`${sockMerchant(n, ar)} \n`); // 2;

    console.log("\nScenario 3: ");
    n = 20;
    ar = [4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5];
    console.log(`${sockMerchant(n, ar)} \n`); // 9;

}



// Finally run the program.
main()
