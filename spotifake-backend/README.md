# SpotiFake 2022

API responsável por gerenciar as musicas favoritas do usuário. Possui como principais funcionalidades:

● Permitir o usuário buscar novas músicas:
1. O serviço deve validar se o usuário informou ao menos 3 caracteres, retornando um HTTP 400
   caso a consulta tenha menos de 3 caracteres.
2. A busca deve ser realizada através do nome de artista e nome da música.
3. A busca por música não deve ser case sensitive.
4. A busca deve retornar valores contendo o filtro, não necessitando de ser informado o nome
   completo de música ou artista.
5. O retorno deve estar ordenado pelo nome do artista e depois pelo nome da música. 

● Permitir adicionar as músicas favoritas do usuário na playlist:
1. Deve receber um request contendo o identificador da música e o identificador da playlist.
2. Deve validar se o identificador da música e o identificador da playlist existem.

● Permitir o usuário remover músicas de sua playlist:
3. Deve receber um request contendo o identificador da música e o identificador da playlist.
4. Deve validar se o identificador da música e o identificador da playlist existem.


# Banco de dados

Para auxiliar o desenvolvimento do API, a estrutura inicial conta com uma base de dados pré-definida e populada

Modelagem: 
Consultar arquivo modelagemBD.png na raiz do projeto.

