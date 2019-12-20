import React, {Component} from 'react';
import axios from 'axios';
import {Switch, Redirect, Route} from 'react-router';

class ProductList extends Component {
    constructor() {
        super();
        this.state = {products: {}
        };
    }
    render () {
                return (
                        <div className="card-body">
				<div>COntent</div>
                        </div>
                );
        };
    }

export default ProductList;
