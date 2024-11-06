function satu() {
  console.log("satu");
}

function dua() {
  console.log("function dua() dieksekusi...");
  setTimeout(() => {
    console.log("dua");
  }, 1000);
}

function tiga() {
  console.log("tiga");
}

satu();
dua();
tiga();
