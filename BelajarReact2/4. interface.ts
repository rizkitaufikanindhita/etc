interface Computer {
  processor: string;
  ram: number;
  vga: string;
}

// interface bisa nambah
interface Computer {
  isExpensive: boolean;
}

function create1(computer: Computer): void {
  console.log("Komputer telah berhasil dirakit");
  console.log(
    `Spesifikasi : ${computer.processor}, ${computer.ram}, ${computer.vga}, ${computer.isExpensive}`
  );
}

const Comp1 = {
  processor: "core i9",
  ram: 64,
  vga: "RTX4090",
  isExpensive: true,
};

create1(Comp1);

// extend
interface ComputerEnter extends Computer {
  Jakarta: boolean;
}

interface ComputerCakra extends Computer {
  Surabaya: boolean;
}

function createToko(toko: ComputerEnter) {
  console.log(`Komputer dari toko Enter dengan spesifikasi 
  ${toko.processor}, ${toko.ram}, ${toko.vga}, ${toko.isExpensive}, ${toko.Jakarta}`);
}

const Enter: ComputerEnter = {
  processor: "core i9",
  ram: 64,
  vga: "RTX4090",
  isExpensive: true,
  Jakarta: true,
};
createToko(Enter);

function createToko1(toko: ComputerCakra) {
  console.log(`Komputer dari toko Cakra dengan spesifikasi
  ${toko.processor}, ${toko.ram}, ${toko.vga}, ${toko.isExpensive}, ${toko.Surabaya}`);
}

const Cakra: ComputerCakra = {
  processor: "core i9",
  ram: 64,
  vga: "RTX4090",
  isExpensive: true,
  Surabaya: true,
};
createToko1(Cakra);
