// void pakai console.log
function jumlah(): void {
  let a: number = 10;
  let b: number = 5;
  console.log(a * b);
}
jumlah();

// ada type datanya pakai return
function create(): string {
  return "terima kasih telah dibuat";
}
console.log(create());

// akan error karena return number seharusnya
// function create(): string {
//   return 3;
// }

const sapa = (): string => "hello mars";
console.log(sapa());

const bagi = (a: number, b: number): number => a / b;
console.log(bagi(20, 5));

const kali = (x: number, y: number): string =>
  `${x} dikali dengan ${y} hasilnya: ${x * y}`;
console.log(kali(5, 4));
