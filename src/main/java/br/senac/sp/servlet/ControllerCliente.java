package br.senac.sp.servlet;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.entidade.Cliente;
import br.senac.sp.utils.BuilderCliente;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerCliente implements Controller {

    /**
     * Realiza consultas
     *
     * @param request
     * @param response
     * @return tipo de acao
     */
    @Override
    public String adicionar(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setCharacterEncoding("UTF-8");
            BuilderCliente builderCliente = new BuilderCliente(request.getParameterMap());
            ClienteDAO clienteDAO = new ClienteDAO();
            Cliente cliente = builderCliente.getObjCliente();
            PrintWriter out = response.getWriter();
            if (clienteDAO.salvarCliente(cliente)) {
                out.write("cliente adicionado com sucesso");
            } else {
                out.write("erro ao adicionar cliente");
            }

        } catch (IOException ex) {
            System.out.println("Erro ao adicionar cliente");
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Class: " + ex.getClass());
        }
        return "adicionar";

    }

    @Override
    public String atualizar(HttpServletRequest request, HttpServletResponse response) {

        try {
            request.setCharacterEncoding("UTF-8");
            BuilderCliente builderCliente = new BuilderCliente(request.getParameterMap());
            ClienteDAO clienteDAO = new ClienteDAO();
            Cliente cliente = builderCliente.getObjCliente();
            PrintWriter out = response.getWriter();
            if (clienteDAO.atualizarCliente(cliente)) {
                out.write("cliente atualizado com sucesso");
            } else {
                out.write("erro ao atualizar cliente");
            }
        } catch (IOException ex) {
            System.out.println("Erro ao atualizar cliente");
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Class: " + ex.getClass());
        }
        return "atualizar";

    }

    @Override
    public String excluir(HttpServletRequest request, HttpServletResponse response) {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            int id = Integer.parseInt(request.getParameter("id"));
            PrintWriter out = response.getWriter();
            if (clienteDAO.excluirCliente(id)) {
                out.write("cliente excluido com sucesso");
            } else {
                out.write("erro ao excluir cliente");
            }
        } catch (IOException ex) {
            System.out.println("Erro ao excluir cliente");
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Class: " + ex.getClass());
        }
        return "excluir";
    }

    @Override
    public String consultar(HttpServletRequest request, HttpServletResponse response) {
        try {
            String consulta = request.getHeader("X-Consulta");
            String consultaTipo = request.getHeader("X-ConsultaTipo");
            PrintWriter out = response.getWriter();
            ClienteDAO clienteDAO = new ClienteDAO();
            Gson gson = new Gson();

            List<Cliente> clientes = clienteDAO.consultarCliente(consulta, consultaTipo);
            response.setContentType("application/json");
            out.write(gson.toJson(clientes));
            out.flush();
            out.close();
        } catch (IOException ex) {
            System.out.println("Erro ao consultar clientes");
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Class: " + ex.getClass());
        }

        return "consultar";
    }
}