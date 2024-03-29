<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta content="text/html; charset=UTF-8" >
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="protegido/filiais/filiais.js"></script>
        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
        <link rel="stylesheet" href="protegido/style.css">
        <link rel="stylesheet" href="protegido/style/cssMedio.css" media="screen and (min-width:900px)">
        <link rel="stylesheet" href="protegido/style/cssPequeno.css" media="screen and (min-width:100px)">
        <link rel="stylesheet" href="protegido/filiais/filiais.css">
        <link rel="stylesheet" href="protegido/style/botoes.css">

    </head>
    <body hidden>
        <div id="divBtns">
            <br>
            <br>
            <h1 id='idFilial'></h1>
            <hr>
            <form id="form" hidden action="cadastroCliente">
            </form>
        </div >
        <!--partial:index.partial.html--> 
        <div id="navMenu" class="nav-menu collapsed">
            <div class="menu-header">
                <div class="menu-title">Menu</div>
                <a id="toggleMenu" class="menu-toggle" href="#">
                    <span class="icon collapse"></span>    
                </a>
            </div>
            <div class="menu-items">
                <ul class="list">
                    <li>
                        <a href="protegido/index.html">
                            <div class="menu-item">        
                                <span class="icon home"></span>
                                <span class="description">INICIO</span>        
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="protegido/cadastroCliente/cadastroCliente.jsp">
                            <div class="menu-item">        
                                <span class="icon clientes"></span>
                                <span class="description">CLIENTES</span>        
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="protegido/cadastroProduto/cadastroProduto.jsp">
                            <div class="menu-item">        
                                <span class="icon produtos"></span>
                                <span class="description">PRODUTOS</span>        
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="protegido/vendas/realizarVenda.jsp">
                            <div class="menu-item">        
                                <span class="icon vendas"></span>
                                <span class="description">VENDAS</span>        
                            </div>
                        </a>
                    </li>     
                    <li>
                        <a href="protegido/relatorios/relatorio.jsp">
                            <div class="menu-item">        
                                <span class="icon relatorios"></span>
                                <span class="description">RELATÓRIOS</span>        
                            </div>
                        </a>
                    </li> 
                    <li>
                        <a href="./logout">
                            <div class="menu-item">        
                                <span class="icon logout"></span>
                                <span class="description">LOGOUT</span>        
                            </div>
                        </a>
                    </li> 
                </ul>
            </div>
        </div>
    </body>
</html>