import React, { Component } from 'react';
import './App.css';
import Validation from './Validation/Validation';
import Char from './Char/Char';

class App extends Component {
  state = {
    textLength: 0,
    textValue: ''
  }

  textLengthChangedHandler = (event) => {
    this.setState({ 
      textLength: event.target.value.length,
      textValue: event.target.value 
    });
  }

  deletedCharacterHandler = (index) => {
    const text = this.state.textValue.split('');
    text.splice(index, 1);
    const updatedText = text.join('');

    this.setState({
      textLength: updatedText.length,
      textValue: updatedText
    });
  }

  render() {
    let characters = null;

    if (this.state.textValue.length !== 0){
      characters = this.state.textValue.split('')
      .map((ch, index) => {
        return <Char 
          character={ch} 
          deleted={this.deletedCharacterHandler.bind(this, index)}
          key={index} />
      })
    }

    return (
      <div className="App">
        <input type="text" onChange={this.textLengthChangedHandler} value={this.state.textValue} />
        <p>Text length: {this.state.textLength}</p>
        <Validation length={this.state.textLength} />
        {characters}
      </div>
    );
  }
}

export default App;
