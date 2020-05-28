<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta content="text/html; charset=UTF-8" >
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="filiais/filiais.js"></script>
        <link rel="stylesheet" href="style/cssMedio.css" media="screen and (min-width:900px)">
        <link rel="stylesheet" href="style/cssPequeno.css" media="screen and (min-width:100px)">
        <link rel="stylesheet" href="style/index.css" media="screen and (min-width:400px)">
        <link rel="stylesheet" href="filiais/filiais.css">
        <link rel="stylesheet" href="style/botoes.css">

    </head>
    <body>
        <header>
            <br>
            <br>
            <h1 id='idFilial'></h1>
            <hr>
            <form id="form" hidden action="cadastroCliente">

                <a href="cadastroCliente/cadastroCliente.jsp" class="btn">Clientes</a><br>
                <a href="cadastroProduto/cadastroProduto.jsp" class="btn">Produtos</a><br>
                <a type="button" value="Vendas" href="vendas/realizarVenda.jsp" class="btn">Vendas</a><br>
                <a type="button" value="Relatórios" href="relatorios/relatorio.jsp" class="btn">Relatório</a><br>
                </header>
            </form>
    </body>
</html>