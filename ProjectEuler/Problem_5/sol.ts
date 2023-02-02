
// Lowest Common Multiple
const lcm = (...arr) => {
    const gcd = (x, y) => (!y ? x : gcd(y, x % y));
    const _lcm = (x, y) => (x * y) / gcd(x, y);
    return [...arr].reduce((a, b) => _lcm(a, b));
  };

  let result = lcm(...[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]);
//   let result = lcm(...[1,3,4,5]);

console.log(result);
