let nama: string = "Rizki Taufik Anindhita";
let age: number = 28;
let isActive: boolean = true;
console.log({ nama });
console.log({ age });
console.log({ isActive });

let num1;
// jangan terlalu banyak menggunakan type data any
num1 = 3.14;
console.log({ num1 });

num1 = "tiga lima";
console.log({ num1 });

// bisa dikasih type data number atau string
let jumlahRumah: number | string;
jumlahRumah = 5;
console.log({ jumlahRumah });
jumlahRumah = "lima";
console.log({ jumlahRumah });

// array
let harta: string[];
harta = ["rumah", "mobil", "logam mulia"];
console.log({ harta });

// tuple array
let nilai: [string, number, boolean];
nilai = ["Rumah", 10, true];
console.log({ nilai });
