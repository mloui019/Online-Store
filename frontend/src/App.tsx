import React from 'react';
import './App.css';
import HomePage from './pages/HomePage';
import Filters from './components/Filters';
import ProductListingPage from './pages/ProductListingPage';

function App() {
  return (
    <div className="App">
      <ProductListingPage />
    </div>
  );
}

export default App;
