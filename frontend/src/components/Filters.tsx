import React from "react";
import styles from "./Filters.module.css";

const Filters = () => {
    return (
        <aside className={styles.filter}>
        <h2> Filters </h2>
            <div>
                <h3> Category </h3>
                <label><input type="checkbox" /> Hair Products </label><br />
                <label><input type="checkbox" /> Hair Tools </label><br />
                <label><input type="checkbox" /> Hair Extensions / Wigs </label><br />
                <label><input type="checkbox" /> Accessories </label>
            </div>

            <div>
                <h3> Price </h3>
                <label><input type="radio" name="price" /> Under $10 </label><br />
                <label><input type="radio" name="price" /> $10-$20 </label><br />
                <label><input type="radio" name="price" /> $20+ </label><br />                
            </div>

            <div>
                <h3> Sort By </h3>
                <select>
                    <option> None </option>
                    <option> Price: Low to High </option>
                    <option> Price: High to Low </option>
                </select>
            </div>

            <button>Apply Filters</button>
        </aside>
    );
};

export default Filters;