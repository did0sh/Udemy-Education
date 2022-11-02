import React from 'react';

const validation = (props) => {
    let output = 'Text too short!';

    if (props.length >= 5) {
        output = 'Text long enough!';
    }

    return (
        <p>{output}</p>
    );
}

export default validation;