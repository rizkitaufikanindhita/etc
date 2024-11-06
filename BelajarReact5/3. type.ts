// type data custom
// deklarasi type
type TemanType = {
  nama: string;
  num: number;
  isHutang: boolean;
};

let temanSaya: TemanType;
temanSaya = {
  nama: "joko",
  num: 10,
  isHutang: true,
};
console.log({ temanSaya });

type Wanita = string;
type isPria = boolean;

type Gender = Wanita | isPria;

let manusia: Gender;
manusia = "Rizki Taufik";
manusia = true;
