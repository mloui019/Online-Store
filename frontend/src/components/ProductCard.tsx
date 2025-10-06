import React from "react";
import { Product } from "../types/Product";

interface ProductCardProps {
    product: Product;
}

// <img src={product.image} alt={product.name}/>

const ProductCard = ( { product } : ProductCardProps ) => {
    return ( 
        <div>
            <h3>{product.name}</h3>
            <p>{product.description}</p>
            <p>${product.price.toFixed(2)}</p>
        </div>
    );
};

export default ProductCard;