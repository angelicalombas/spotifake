import { Musicas } from "../../types/musicas";
import './List.styles.scss';
import { CgPlayButtonO as Seta } from 'react-icons/cg'

type Props = {
    musica: Musicas;
}

function List({ musica }: Props) {
    return (
        <ul className="container">
            <Seta size={35}/>
            <div className="container--row">
                <div className='container--musica'>{musica.nome}</div>
                <div className='container--artista'>{musica.artistaId.nome}</div>
            </div>
        </ul>


    )
}

export default List;