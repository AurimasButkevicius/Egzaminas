import React from 'react';
import {Switch, Redirect, Route} from 'react-router';
import {BrowserRouter, Link} from 'react-router-dom';

var Navigation = (props) => {
    return (
        <div className="container col-12">
            <div>
                <Link to='/'>Home</Link>
                |&nbsp;
                <Link to='/products'>Products</Link>
                |&nbsp;
                {/* <Link to='/category2/'>Category2</Link>
                |&nbsp;
                <Link to='/category3/'>Category3</Link>
                |&nbsp; */}
                <Link to='/administration'>Administration</Link>
            </div>
            {props.children}
        </div>
    );
    
}

export default Navigation;
