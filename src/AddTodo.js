const AddTodo = (props) => {
  return (
    <div className="bg-white rounded-xl shadow-xl p-5 border-2 flex item-center justify-center text-center mt-10 mx-80">
      <input
        className="w-11/12 mx-3 shadow appearance-none border rounded py-4 text-gray-700 leading-tight focus:outline-none focus:shadow-outline text-left px-4"
        id="username"
        type="text"
        onChange={props.handleInput}
        value={props.getTodo}
        placeholder="Masukkan todo..."
      ></input>
      <button
        className="w-auto mx-3 text-white font-bold py-2 rounded focus:outline-none focus:shadow-outline text-2xl"
        type="button"
        onClick={() => {
          props.addTodo();
        }}
      >
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
          <circle cx="12" cy="12" r="10" />{" "}
          <line x1="12" y1="8" x2="12" y2="16" />{" "}
          <line x1="8" y1="12" x2="16" y2="12" />
        </svg>
      </button>
    </div>
  );
};

export default AddTodo;
