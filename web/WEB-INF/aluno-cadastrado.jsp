<html>
    <head>
        <meta charset="UTF-8">
        <title>Detalhes da Ocorr�ncia</title>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
    </head>
    <body>
        <center>
        <div id="pagina">
            <div id="menus">
                <ul>
                    <li><a href="AlunoServlet">Cadastro de Alunos</a></li>
                </ul>
                <ul>
                    <li><a href="ProfessorServlet">Cadastro de Professores</a></li>
                </ul>
                <ul>
                    <li><a href="OcorrenciaServlet">Lan�ar Ocorr�ncia</a></li>
                </ul>
                <ul>
                    <li><a href="BuscaServlet">Buscar Ocorr�ncia</a></li>
                </ul>
                <ul>
                    <li><a href="TotaisPorGrupo">Totais</a></li>
                </ul>
            </div>

            <!-- Conteudo da Página -->
            <div id="conteudo">
                <div id="conteudo_pagina">
                    <h1>Detalhes da Ocorrencia: </h1>
                    <h2>Aluno: ${alunos.nome}</h2>
                    <h2>Data de matr�cula: ${alunos.dataMatricula}</h2>

                </p><br /><br />
                <a href="AlunoServlet">Novo cadastro</a><br />
                </div>
                </div>
            </div>

            <!-- Rodapé da Página -->
            <div id="rodape">
                Produzido por: <a href="mailto:luiz.santos89@yahoo.com.br">Luiz Santos</a> e  
                <a href="je_barbosaa@hotmail.com">J�ssica Barbosa</a><br />
            </div>
        </div>
        </center>
    </body>
</html>