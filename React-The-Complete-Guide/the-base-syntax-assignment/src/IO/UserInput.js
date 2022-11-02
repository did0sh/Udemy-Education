import React from 'react';
import './IO.css';

const userInput = (props) => {
    return <input className="username-input" type="text" onChange={props.changeUsername} value={props.username} />
}

export default userInput;