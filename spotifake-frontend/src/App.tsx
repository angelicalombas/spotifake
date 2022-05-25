import React from 'react';
import './App.scss';
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import NavBar from './components/Navbar';
import Footer from './components/Footer';
import Musica from './pages/Musica';
import Home from './pages/Home';

function App() {
  return (
    <BrowserRouter>
      <NavBar/>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/buscarmusicas' element= {<Musica/>}/>       
      </Routes>
      <Footer/>
    </BrowserRouter>
  );
}

export default App;
