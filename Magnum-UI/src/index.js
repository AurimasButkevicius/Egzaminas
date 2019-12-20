import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import {Switch, Redirect, Route} from 'react-router';
import {BrowserRouter, Link} from 'react-router-dom';
import ProductList from './Components/Categories/ProductList';
import ProductDetails from './Components/Categories/ProductDetails'
import Administration from './Components/Administration/Admin'
import User from './Components/User/User';
import Navigation from './Components/Navigation/Navigation';

var handleClick = () => {

}

var Cat1 = (props) => {
    return (
        <div className='container'>
            <header className="container">
                <div className="row">
                    <User/>
                </div>
            </header>
            <div>
                <Navigation/>
            </div>
            <div className='container row'>
                <ProductList/>
            </div>
        </div>
    );
}

var productDetails = (props) => {
    return (
        <div className='container'>
            <header className="container">
                <div className="row">
                    <User/>
                </div>
            </header>
            <div>
                <Navigation/>
            </div>
            <div className='container row'>
                <ProductDetails onClick={handleClick}/>
            </div>
        </div>
    );
}

var Cart = (props) => {
    return (
        <div className='container'>
            <header className="container">
                <div className="row">
                    <User/>
                </div>
            </header>
            <div>
                <Navigation/>
            </div>
            <div className='container row'>
                <Cart onClick={handleClick}/>
            </div>
        </div>
    );
}
var Admin = (props) => {
    return (
        <div>
            <Administration/>
        </div>
    );
}


ReactDOM.render(
    <BrowserRouter>
    <Switch>
        <Route exact path='/' component={App} key='home'/>
        <Route name="Products" path="/products" component={Cat1} key='products'/>
        <Route name="Cart" path="/cart" component={Cart} key='cart'/>
        <Route path="/products/:id" component={productDetails} />
        <Route path="/administration" component={Admin} key='administration'/>
    </Switch>
</BrowserRouter>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls. Learn
// more about service workers: https://bit.ly/CRA - PWA
serviceWorker.unregister();
