import { Fragment } from "react";

const Card = () => {
  return (
    <Fragment>
      <div>
        <div className="items-center justify-center p-10 mt-20 mb-10 mx-96">
          <div className="p-5 mx-auto shadow-xl bg-slate-300 rounded-xl">
            <div className="w-full p-10 rounded-lg shadow-xl bg-slate-600 -mt-11">
              <div className="text-white">
                <div className="grid grid-flow-row-dense grid-cols-3 grid-rows-2 -mb-7">
                  <div className="">
                    <div className="col-span-2 text-xs">Expiry:</div>
                    <div className="col-span-2 text-xl font-semibold">
                      ********
                    </div>
                  </div>
                  <div className="ml-5 text-right w-44">
                    <div className="col-span-2 text-xs">CVV:</div>
                    <div className="col-span-2 text-xl font-semibold">
                      ********
                    </div>
                  </div>
                </div>
                <div className="my-5">
                  <div className="text-xs">Cardholder:</div>
                  <div className="text-xl font-semibold">********</div>
                </div>
                <div className="">
                  <div className="p-2 text-2xl font-bold text-center text-gray-600 bg-gray-300">
                    ********
                  </div>
                </div>
              </div>
            </div>
            <div className="p-5 mx-auto mt-10 text-3xl font-semibold text-white border-2 shadow-xl w-fit bg-slate-500 rounded-xl">
              Credit card has been added
            </div>
          </div>
        </div>
      </div>
    </Fragment>
  );
};

export default Card;
