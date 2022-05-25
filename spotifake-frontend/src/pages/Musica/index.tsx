import './Musica.styles.scss';
import { CgSearch , CgMusicNote} from 'react-icons/cg';
import List from '../../components/List';
import { Musicas } from '../../types/musicas';
import { useEffect, useState } from 'react';
import api from '../../utils/api';


function Musica() {

    const [musicas, setMusica] = useState<Musicas[]>([]);
    const [busca, setBusca] = useState('');

    // useEffect(() => {
    //     api.get<Musicas[]>("/musicas?filtro=" + busca).then(response => {
    //         console.log(response);
    //         setMusica(response.data)
    //     })
    //         .catch((err) => {
    //             console.error("ops! ocorreu um erro : " + err);
    //         });
    // }, [busca]);


    function buscarMusicas(busca : string){
        api.get<Musicas[]>("/musicas?filtro=" + busca).then(response => {
            console.log(response);
            
            if (response.status === 204){
                alert('Musica ou Artista não encontrados')
                setMusica([]);
            }else{
                setMusica(response.data)
            }
        }).catch((err) => {
            alert('Musica ou Artista não encontrados')
            setMusica([]);
        })
    }

    if (!musicas) return null;

    return (
        <div className='buscador'>
            <h1 className='buscador--h1'>Busca de musicas</h1>
            <div className='buscador--div--busca'>
                <input
                    placeholder='insira o nome da música'
                    className='buscador--input'
                     value={busca}
                     onChange={evento => setBusca(evento.target.value)}
                />
                <CgSearch className='buscador--icon' size={30} color="#4C4D5E" onClick={() => buscarMusicas(busca)}/>
                

            </div>
            <div className='buscador--lista'>
                {musicas.map(musica => (
                    <List key={musica.id} musica={musica} />
                ))}
            </div>
        </div>
    )
}

export default Musica;