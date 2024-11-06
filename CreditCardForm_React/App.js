import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import InputInfo from "./components/inputInfo";
import Card from "./components/Card";

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path="/" element={<InputInfo />} />
          <Route path="/card" element={<Card />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
