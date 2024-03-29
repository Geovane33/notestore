/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.servlet;

import br.senac.sp.dao.UsuarioSistemaDAO;
import br.senac.sp.entidade.UsuarioSistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tscarton
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println();
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        UsuarioSistemaDAO usuarioSistemaDAO = new UsuarioSistemaDAO();
        List<UsuarioSistema> usuarios = usuarioSistemaDAO.consultar("", usuario);
        if (!usuarios.isEmpty()) {
            UsuarioSistema usuarioLogado = usuarios.get(0);
            if (usuarioLogado != null && usuarioLogado.validarSenha(senha)) {
                HttpSession sessao = request.getSession();
                sessao.setAttribute("usuario", usuarioLogado);
                response.sendRedirect(request.getContextPath() + "/protegido/index.html");
            } else {
                PrintWriter out = response.getWriter();
                out.write("401");
                out.flush();
                out.close();
            }
        } else {
            PrintWriter out = response.getWriter();
            out.write("404");
            out.flush();
            out.close();
        }
    }

}
