import AddTodo from "./AddTodo";
import ListTodo from "./ListTodo";
import { useState } from "react";

const App = () => {
  const [getTodo, setTodo] = useState("");
  const [getTodoList, setTodoList] = useState([]);

  const addTodo = () => {
    if (getTodo === "") {
      alert("Todo tidak boleh kosong");
    } else {
      const dataTodo = { getTodo, status: false };
      setTodoList([dataTodo, ...getTodoList]); // push data ke array
      setTodo("");
    }
  };

  const handleInput = (e) => {
    const data = e.target.value;
    setTodo(data);
  };

  const deleteTodo = (index) => {
    const newData = getTodoList.filter((value, i) => i !== index); // filter data yang tidak sama dengan index, index adalah index data yang akan dihapus
    setTodoList(newData);
  };

  const doneTodo = (index) => {
    const cloneTodoList = [...getTodoList];
    cloneTodoList[index].status = !cloneTodoList[index].status;
    setTodoList(cloneTodoList);
  };

  return (
    <div>
      <h1 className="text-4xl font-extrabold items-center justify-center text-center mt-10">
        TODO WEB APP
      </h1>

      {/* input todo */}
      <AddTodo handleInput={handleInput} addTodo={addTodo} getTodo={getTodo} />
      {/* list todo */}
      <ListTodo
        deleteTodo={deleteTodo}
        getTodoList={getTodoList}
        doneTodo={doneTodo}
      />
    </div>
  );
};
export default App;
