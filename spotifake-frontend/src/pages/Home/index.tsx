import { Link } from "react-router-dom";
import './Home.styles.scss';

function Home() {
    return (
        <div className="section">
            <div>
                <h1>É música que você quer?</h1>
                <h2>Ouça os melhores lançamentos do momento</h2>
                <button className="section--button"><Link to={'/buscarmusicas'}>Buscar músicas</Link></button>
            </div>
        </div>
    )

}

export default Home;