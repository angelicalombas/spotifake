import { CgSearch } from 'react-icons/cg';

interface Props{
    busca: string,
    setBusca: React.Dispatch<React.SetStateAction<string>>;
}

function Buscador({busca, setBusca} : Props) {
    return (
        <div>
            <h1 className='buscador--h1'>Busca de musicas</h1>
            <div className='buscador--div--busca'>
                <input
                    placeholder='insira o nome da música'
                    className='buscador--input'
                    value={busca}
                    onChange={evento => setBusca(evento.target.value)}
                    />
                    <CgSearch className='buscador--icon' size={30} color="#4C4D5E" onClick={() => setBusca(busca)}/>
            </div>
        </div>
    )
}

export default Buscador;