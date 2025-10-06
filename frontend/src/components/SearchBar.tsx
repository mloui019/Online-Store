import React from "react";

interface SearchBarProps {
    value : string;
    onChange : (value : string) => void;
}

const SearchBar = ({value, onChange} : SearchBarProps) => {
    return (
        <input type="text"
        value={value}
        onChange={(event) => onChange(event.target.value)}
        />
    );
};

export default SearchBar;