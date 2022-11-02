import './App.css';
import React, { Component } from 'react';
import UserOutput from './IO/UserOutput';
import UserInput from './IO/UserInput';

class App extends Component {
  state = {
    username: 'did0sh'
  }

  changeUsernameHandler = (event) => {
    this.setState({
      username: event.target.value
    })
  }

  render() {
    const style = {
      border: '1px solid black',
      boxShadow: '1px solid #ccc',
      backgroundColor: 'green',
      font: 'inherit',
      cursor: 'pointer'
    }

    return (
      <div className="App">
        <UserOutput style={style} username={this.state.username} />
        <UserInput username={this.state.username} changeUsername={this.changeUsernameHandler} />
        <button style={style}>Styled Button</button>
      </div>
    )
  }
}

export default App;
