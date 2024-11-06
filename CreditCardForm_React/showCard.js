const ShowCard = (props) => {
  return (
    <div className="p-10 rounded-lg bg-slate-600 w-full shadow-xl -mt-11">
      <div className="text-white">
        <div className="grid grid-flow-row-dense grid-cols-3 grid-rows-2 -mb-7">
          <div className="">
            <div className="text-xs col-span-2">Expiry:</div>
            <div className="font-semibold text-xl col-span-2">
              {props.getDate}
            </div>
          </div>
          <div className="ml-5 w-44 text-right">
            <div className="text-xs col-span-2">CVV:</div>
            <div className="font-semibold text-xl col-span-2">
              {props.getCVV}
            </div>
          </div>
        </div>
        <div className="my-5">
          <div className="text-xs">Cardholder:</div>
          <div className="font-semibold text-xl">{props.getName}</div>
        </div>
        <div className="">
          <div className="bg-gray-300 p-2 text-center text-gray-600 font-bold text-2xl">
            {props.getNumber}
          </div>
        </div>
      </div>
    </div>
  );
};

export default ShowCard;
