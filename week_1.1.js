// list
let pictures = ["pic1.jpg", "pic2.jpg", "pic3.jpg"];
console.log(pictures[0]);

// object
let info = {
  name: "rizki",
  age: 28,
  domisili: "Jaktim",
};
console.log(info);
console.log(info.name);

// loops
let users = ["rizki", "taufik", "anindhita"];
for (i = 0; i < users.length; i++) {
  console.log("nama usernya", users[i]);
}
console.log();

// array of object
let infoUsers = [
  { nama: "rizki", umur: 28, domisili: "jaktim" },
  { nama: "reysa", umur: 28, domisili: "jaktim" },
  { nama: "sahla", umur: 3, domisili: "jaktim" },
];
console.log(infoUsers[0].nama);
console.log();

// function
function printAllUsers(infoUsers) {
  for (i = 0; i < infoUsers.length; i++) {
    console.log(
      "nama user",
      infoUsers[i].nama,
      "berumur",
      infoUsers[i].umur,
      "domisili di",
      infoUsers[i].domisili
    );
    console.log();
  }
}
printAllUsers(infoUsers);

// sum form start to end
// normal function
function jumlah(startNilai, endNilai) {
  result = 0;
  for (i = startNilai; i <= endNilai; i++) {
    result += i;
  }
  return result;
}
// Arrow function
let hasil = (startVal, endVal) => {
  result = 0;
  for (i = startVal; i <= endVal; i++) {
    result += i;
  }
  return result;
};
console.log(jumlah(56, 314));
console.log(hasil(1, 100));
console.log(hasil(56, 314));
console.log();

// higher-order function
let sum = (a, b) => {
  return a + b;
};
let multiply = (a, b) => {
  return a * b;
};
let substract = (a, b) => {
  return a - b;
};
let doAritmetic = (a, b, func) => {
  return func(a, b);
};
console.log(doAritmetic(10, 5, sum));
