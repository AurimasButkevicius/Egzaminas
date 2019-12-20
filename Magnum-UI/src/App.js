import React from 'react';
import './App.css';
import User from './Components/User/User';
import Navigation from './Components/Navigation/Navigation';
import Main from './Components/Home/Main'

function App() {
    return (
        <div className="container">
            <header className="container">
                <div className="row">
                    <User/>
                </div>
            </header>
            <div>
                <Navigation/>
            </div>
            <div>
                <Main/>
            </div>
        </div>
    );
}

export default App;
