import React from "react";
import { Product } from "../types/Product";

interface ProductCardProps {
    product: Product;
}

const ProductCard = ( { product } : ProductCardProps ) => {
    return ( 
        <div>
            <img src={product.image} alt={product.name}/>
            <h3> {product.name} </h3>
            <p>${product.price.toFixed(2)}</p>
        </div>
    );
};

export default ProductCard;