// e.g sync
// let result = 0;
// for (i = 0; i < 10000000000; i++) {
//   result += 1;
// }
// console.log(result);
// // terjadi blocking maka expensive task diatas perlu async agar tidak terjadi blocking
// console.log("1 task");

// SETTIMEOUT - callback
// agar tidak blocking
// let result = 0;
// setTimeout(() => {
//   for (i = 0; i < 1000000000; i++) {
//     result += 1;
//   }
//   console.log("3 seconds have passed");
//   console.log("hasilnya =", result);
// }, 3 * 1000);

// console.log("1 task");

// STOP WATCH
// let counter = 1;
// setInterval(() => {
//   console.log(counter);
//   counter += 1;
// }, 1000);

// CASE
// ini bakal masuk async process
let counter1 = 1;
setInterval(() => {
  console.log(counter1);
  counter1 += 1;
}, 1000);

// lanjut ke sini untuk proses ini
// karena JS single thread maka satu-satu task yang dikerjakan
// karena expensive task dan sync maka ini dulu yang diproses
// kalau sudah baru async (async masih di callback queue)
// menyebabkan blocking
let result = 0;
for (i = 0; i < 10000000000; i++) {
  result += 1;
}
console.log(result);

// simulasi call stack, web apis, callback queue, event loop di http://latentflip.com/loupe

// lanjut week 1.3 01:08:00
