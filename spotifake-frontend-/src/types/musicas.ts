// export type Artistas = {
//     id: string;
//     nome: string;
// }

export type Musicas = {
    id: string,
    nome: string,
    artistaId: {
        id: string,
        nome: string
    }
}

