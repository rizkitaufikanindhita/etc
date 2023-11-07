import { Fragment, useState, useRef } from "react";
import React from "react";
import Datepicker from "react-tailwindcss-datepicker";
import ShowCard from "./showCard";
import { useNavigate } from "react-router-dom";

const InputInfo = () => {
  const navigate = useNavigate();

  const [value, setValue] = useState({
    startDate: null,
    endDate: null,
  });

  const handleValueChange = (newValue) => {
    console.log("newValue:", newValue);
    setValue(newValue);
  };

  const [getName, setName] = useState("");
  const [getNumber, setNumber] = useState();
  const [getCVV, setCVV] = useState();

  const handleSubmit = () => {
    navigate("/card");
  };

  return (
    <Fragment>
      <div className="mx-20 mt-10 mb-10">
        <div className="p-5 shadow-xl bg-slate-300 mx-96 rounded-xl">
          <ShowCard
            getName={getName}
            getNumber={getNumber}
            getCVV={getCVV}
            getDate={value.startDate}
          />
          <div className="grid grid-rows-2 mt-10">
            <label className="">Name on Card</label>
            <input
              placeholder="name"
              className="px-2 py-2 -my-1 text-gray-300 bg-gray-800 rounded-md"
              onChange={(e) => setName(e.target.value)}
            />
          </div>
          <div className="grid grid-rows-2 mt-5">
            <label className="">Card number</label>
            <input
              placeholder="card number"
              className="px-2 py-2 -my-1 text-gray-300 bg-gray-800 rounded-md"
              type="number"
              onChange={(e) => setNumber(e.target.value)}
            />
          </div>
          <div className="grid grid-flow-row-dense grid-cols-3 grid-rows-2 mt-5">
            <label className="col-span-2">Expiry date</label>
            {/* <input className="col-span-2 p-1 mr-3 rounded-md shadow-inner shadow-gray-400" /> */}
            <div className="col-span-2 mr-3 -my-1 rounded-md shadow-gray-400">
              <Datepicker
                useRange={false}
                asSingle={true}
                value={value}
                onChange={handleValueChange}
              />
            </div>
            <label>CVV</label>
            <input
              className="p-1 -my-1 text-gray-300 bg-gray-800 rounded-md"
              type="number"
              placeholder="123"
              onChange={(e) => setCVV(e.target.value)}
            />
          </div>
          <div>
            <button
              className="w-full p-1 mt-5 text-white rounded-md shadow-inner bg-slate-600 shadow-gray-800"
              onClick={() => {
                handleSubmit();
              }}
            >
              Submit
            </button>
          </div>
          <div className="mt-5 border-b-2 border-slate-600 opacity-40"></div>
          <div className="items-center justify-center text-center">
            <p className="mt-2 text-sm font-semibold">
              Please enter your credit card details
            </p>
          </div>
        </div>
      </div>
    </Fragment>
  );
};

export default InputInfo;
