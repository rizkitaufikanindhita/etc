// let pattern1 = (numRow) => {
//   for (let i = 0; i < numRow; i++) {
//     let star = "";
//     for (let j = 0; j < numRow; j++) {
//       star += "*";
//     }
//     console.log(star);
//   }
// };

// pattern1(5);

let pattern2 = (numRow) => {
  for (let i = 0; i < numRow; i++) {
    let star = "";
    for (let j = 0; j < numRow; j++) {
      if ((i === 0) | (i === numRow - 1)) {
        star += "*";
      } else {
        if ((j === 0) | (j === numRow - 1)) {
          star += "*";
        } else {
          star += " ";
        }
      }
    }
    console.log(star);
  }
};
pattern2(5);
