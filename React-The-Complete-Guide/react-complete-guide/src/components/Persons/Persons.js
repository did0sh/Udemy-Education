import React, { PureComponent } from 'react';
import Person from './Person/Person';
import AuthContext from '../../context/auth-context';

class Persons extends PureComponent {
    // shouldComponentUpdate(nextProps, nextState) {
    //     console.log('[Persons.js] shouldComponentUpdate');
    //     if (nextProps.persons !== this.props.persons || 
    //         nextProps.changed !== this.props.changed || 
    //         nextProps.clicked !== this.props.clicked) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log('[Persons.js] getSnapshotBeforeUpdate');
        return { message: 'Snapshot' }
    };

    componentDidUpdate(prevProps, prevState, snapshot) {
        console.log('[Persons.js] componentDidUpdate');
        console.log(snapshot);
    }

    componentWillUnmount() {
        console.log('[Persons.js] componentWillUnmount');
    }

    render() {
        console.log('[Persons.js] rendering...')
        return (
            <AuthContext.Consumer>
                {(context) => this.props.persons.map((person, index) => {
                    return (
                        <Person
                            click={(event) => this.props.clicked(event, person.id)}
                            name={person.name}
                            age={person.age}
                            key={person.id}
                            changed={(event) => this.props.changed(event, person.id)}
                            isAuth={this.props.isAuthenticated} />
                    );
                })}
            </AuthContext.Consumer>
        );
    }
};

export default Persons;