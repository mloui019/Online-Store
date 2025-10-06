import React, { ReactNode } from "react";

interface GridProps {
    children : ReactNode;
}

const Grid = ( {children} : GridProps) => {
    return (
        <div> {children} </div>
    );
};

export default Grid;
