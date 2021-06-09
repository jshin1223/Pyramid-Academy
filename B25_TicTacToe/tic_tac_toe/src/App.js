import "./Game.css";
import {BrowserRouter as Router, Route, Switch, Link} from "react-router-dom"; 
import Game from "./Components/Game";
import Welcome from "./Components/Welcome"; 
import Square from "./Components/Square"; 


function App() {

  return (
    <Router>
      <Switch>
        <Route path = "/" exact component={Welcome} /> 
        <Route path = "/game" exact component={Game} /> 

      </Switch>
    </Router>
  
  ); 


}

export default App;