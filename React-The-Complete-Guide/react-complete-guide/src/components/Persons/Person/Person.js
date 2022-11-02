import React, { Component } from 'react';
import PropTypes from 'prop-types';

import classes from './Person.css';
import Aux from '../../../hoc/Auxiliary';
import withClass from '../../../hoc/withClass';
import AuthContext from '../../../context/auth-context';

class Person extends Component {
    constructor(props) {
        super(props);
        this.inputElementRef = React.createRef();
    }

    static contextType = AuthContext;

    componentDidMount() {
        // this.inputElement.focus();
        this.inputElementRef.current.focus();
        console.log(this.context.authenticated);
    }

    render() {
        console.log('[Person.js] rendering...');
        return (
        <Aux>
            <AuthContext.Consumer>
                {(context) => context.authenticated ? <p>Authenticated!</p> : <p>Please log in</p>}
            </AuthContext.Consumer>
            <p key="i1" onClick={this.props.click}>
                I'm a {this.props.name} and I am {this.props.age} years old!
            </p>
            <p key="i2">{this.props.children}</p>
            <input
                key="i3"
                // ref={(inputEl) => {this.inputElement = inputEl}}
                ref={this.inputElementRef}
                type="text"
                onChange={this.props.changed}
                value={this.props.name}
            />
        </Aux>
        );
    }
}

Person.propTypes = {
    click: PropTypes.func,
    name: PropTypes.string,
    age: PropTypes.number,
    change: PropTypes.func
};

export default withClass(Person, classes.Person);