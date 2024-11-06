import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";

const App = () => {
  const [getNama, setNama] = useState("Reysa Ayuningtyas Wardani");

  const [getButton, setButton] = useState("Ganti Nama");

  const handleNama = () => {
    if (getNama == "Reysa Ayuningtyas Wardani") {
      setNama("Rizki Taufik Anindhita");
      setButton("Kembali");
    } else {
      setNama("Reysa Ayuningtyas Wardani");
      setButton("Ganti Nama");
    }
  };

  const [getUmur, setUmur] = useState(28);

  // const increaseUmur = () => {
  //   setUmur(getUmur + 1);
  // };

  // const decreaseUmur = () => {
  //   if (getUmur == 0) {
  //     alert("Umur tidak boleh kurang dari 0");
  //   } else {
  //     setUmur(getUmur - 1);
  //   }
  // };
  // dimasukin ke button onClick

  // cara cek state
  // console.log({ getNama });

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p className="mt-4">{getNama}</p>
        <div className="grid grid-cols-3 m-4">
          <div>
            <button
              onClick={() => {
                getUmur == 0
                  ? alert("Umur tidak boleh kurang dari 0")
                  : setUmur(getUmur - 1);
              }}
              className="text-3xl font-semibold text-white mt-2"
            >
              <svg
                class="h-8 w-8 text-white"
                viewBox="0 0 24 24"
                fill="none"
                stroke="currentColor"
                stroke-width="2"
                stroke-linecap="round"
                stroke-linejoin="round"
              >
                {" "}
                <circle cx="12" cy="12" r="10" />{" "}
                <line x1="8" y1="12" x2="16" y2="12" />
              </svg>
            </button>
          </div>
          <div>
            <p className="mt-1">{getUmur}</p>
          </div>
          <div>
            <button
              onClick={() => {
                setUmur(getUmur + 1);
              }}
              className="text-3xl font-semibold text-white mx-2 mt-2"
            >
              <svg
                class="h-8 w-8 text-white"
                viewBox="0 0 24 24"
                fill="none"
                stroke="currentColor"
                stroke-width="2"
                stroke-linecap="round"
                stroke-linejoin="round"
              >
                {" "}
                <circle cx="12" cy="12" r="10" />{" "}
                <line x1="12" y1="8" x2="12" y2="16" />{" "}
                <line x1="8" y1="12" x2="16" y2="12" />
              </svg>
            </button>
          </div>
        </div>
        <button
          onClick={() => {
            handleNama();
          }}
          className="bg-white rounded-full text-2xl font-semibold text-gray-800 px-4 py-2 m-4"
        >
          {getButton}
        </button>
      </header>
    </div>
  );
};

export default App;
