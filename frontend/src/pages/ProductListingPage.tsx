import React, { useEffect, useState } from "react";

import Filters from "../components/Filters";
import Grid from "../components/Grid";
import ProductCard from "../components/ProductCard";
import { Product } from "../types/Product";
import { Filter } from "../types/Filter";

const ProductListingPage = () => {
  const [products, setProducts] = useState<Product[]>([]);
  /*const [filters, setFilters] = useState({
    categories : [] as string[],
    minprice : '',
    maxprice : ''
  });*/

    useEffect(() => {
        fetch("http://localhost:8080/products")
        .then((response) => response.json())
        .then((data: Product[]) => setProducts(data))
        .catch((err) => console.error("Cannot load products", err));
    }, []);

    //useEffect()

    return (
        <main>
            <h1> Products </h1>
            <Filters />
            <Grid>
                {products.map((product) => (
                <ProductCard key={product.id} product={product} />
                ))}
            </Grid>
        </main>
    );
};

export default ProductListingPage;