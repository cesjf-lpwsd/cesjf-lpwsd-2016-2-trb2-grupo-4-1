<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar aluno:</title>
    </head>
    <body>
        <h1>Cadastrar Aluno:</h1>
        <table>
            <form action="AlunoServlet">
                <tr>
                    <td>Nome: </td>
                    <td><input type="text" name="nome" /></td>
                </tr>
                <tr>
                    <td>Rua/n.º: </td>
                    <td><input type="text" name="rua" /></td>
                </tr>
                <tr>
                    <td>Bairro: </td>
                    <td><input type="text" name="bairro" /></td>
                    
                </tr>
            </form>
        </table>
    </body>
</html>
