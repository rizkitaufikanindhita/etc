const ListTodo = (props) => {
  return (
    <div className="bg-white rounded-xl shadow-xl mt-10 mx-80 border-2">
      <div className="text-2xl font-bold p-5 border-b-2 flex item-center justify-center text-left ">
        <div className="w-3/4">Nama Todo</div>
        <div className="px-5 w-1/4">Action</div>
      </div>
      {props.getTodoList.map((value, index) => {
        return (
          <div
            className="text-xl font-semibold p-5 border-b-2 grid grid-cols-8 item-center justify-center"
            key={index.toString()}
          >
            <div
              className={`col-span-5 mt-2 text-left ${
                value.status
                  ? "line-through italic w-fit rounded-lg text-slate-400"
                  : ""
              }`}
            >
              {value.getTodo}
            </div>
            <button
              className="text-center text-white py-2 mx-20"
              onClick={() => {
                props.doneTodo(index);
              }}
            >
              {value.status ? (
                <svg
                  className="h-8 w-8 text-blue-500"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="currentColor"
                  stroke-width="2"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                >
                  {" "}
                  <path d="M22 11.08V12a10 10 0 1 1-5.93-9.14" />{" "}
                  <polyline points="22 4 12 14.01 9 11.01" />
                </svg>
              ) : (
                <svg
                  className="h-8 w-8 text-blue-500"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="currentColor"
                  stroke-width="2"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                >
                  {" "}
                  <circle cx="12" cy="12" r="10" />
                </svg>
              )}
            </button>
            <button className="text-center bg-blue-600 rounded-lg text-white py-2 mx-2">
              Edit
            </button>
            <button
              className="text-center bg-red-600 rounded-lg text-white py-2 mx-2"
              onClick={() => {
                props.deleteTodo(index);
              }}
            >
              Delete
            </button>
          </div>
        );
      })}
    </div>
  );
};

export default ListTodo;
