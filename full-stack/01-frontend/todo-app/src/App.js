import './App.css';
import { Component } from 'react';

function App() {
  return (
    <div className="App">
      My Todo Application  
      <FirstComponent  />
      <SecondComponent />
      <ThirdComponent  />
      <FourthComponent />
    </div>
  );
}

function FirstComponent() {
  return (
    <div className='FirstComponent'>Testing First</div>
  );
}

function SecondComponent() {
  return (
    <div className='SecondComponent'>Second Component</div>
  );
}

class ThirdComponent extends Component{
  render() {
    return (
      <div className='ThirdComponent'>Third Component</div>
    );
  }
}

class FourthComponent extends Component{
  render() {
    return (
      <div className='FourthComponent'>Fourth testing</div>
    );
  }
}

export default App;
