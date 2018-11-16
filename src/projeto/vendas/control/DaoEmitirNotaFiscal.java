
package projeto.vendas.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projeto.vendas.model.NotaFiscal;

public class DaoEmitirNotaFiscal {
    private Connection conn;

    public DaoEmitirNotaFiscal(Connection conn) {
        this.conn = conn;
    }

    public NotaFiscal Consultar(int codigo) {
        PreparedStatement ps = null;
        NotaFiscal nf = null;
        try {
            ps = conn.prepareStatement("Select * from nota_fiscal where numero = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nf = new NotaFiscal(rs.getInt("numero"),
                        rs.getInt("serie"),
                        rs.getInt("PedidoCod"),
                        rs.getString("Tipo"),
                        rs.getString("CFOP"),
                        rs.getFloat("Total"),
                        rs.getString("DataEmissao"),
                        rs.getString("HoraEmissao"),
                        rs.getInt("TranspCod")
                );

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return (nf);
    }

    public int getProximoCodigo() {
        int codigo = 1;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("select max(numero) as codigo from Nota_Fiscal");
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                codigo = (rs.getInt("codigo"));
                codigo = codigo + 1;
            } else {
                codigo = 1;
            }
        } catch (SQLException ex) {
            System.out.println("ERRO SQL :" + ex);
        }
        return codigo;
    }

    public boolean inserir(NotaFiscal nf) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT into Nota_Fiscal(Numero, Serie, PedidoCOD, Tipo,"
                    + "Total,DataEmissao,HoraEmissao,TRANSPCOD,TRANSP_DATASAIDA,TRANSP_HORASAIDA,"
                    + "CFOP,NATUREZADAOPERACAO,BASEICMS,ICMS,IPI,CHAVEACESSO,VALORFRETE,PLACAVEICULO,VALORSEGURO)"
                    + "VALUES(?, ?, ?, ? , ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?)");
            
            


            ps.setInt(1, nf.getNumero());
            ps.setInt(2, nf.getSerie());
            ps.setInt(3, nf.getPedidoCod());
            ps.setString(4, nf.getTipo());
            ps.setDouble(5, nf.getTotal());
            ps.setString(6, nf.getDataEmissao());
            ps.setString(7, nf.getHoraEmissao());
            ps.setInt(8, nf.getTranspCod());
            ps.setString(9, "");
            ps.setString(10, "");
            ps.setString(11, nf.getCFOP());
            ps.setString(12,nf.getNaturezaDaOperacao());
            ps.setFloat(13, nf.getBaseICMS());
            ps.setFloat(14, nf.getICMS());
            ps.setFloat(15,nf.getIPI());
            ps.setString(16, "");
            ps.setFloat(17, 0);
            ps.setString(18, "");
            ps.setFloat(19, 0);
            
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public ArrayList<NotaFiscal> ListarNotasFiscais() {
        NotaFiscal nf = null;
        ArrayList<NotaFiscal> lista = new ArrayList();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Nota_Fiscal");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                nf = new NotaFiscal(rs.getInt("numero"),
                        rs.getInt("serie"),
                        rs.getInt("PedidoCod"),
                        rs.getString("Tipo"),
                        rs.getString("CFOP"),
                        rs.getDouble("Total"),
                        rs.getString("DataEmissao"),
                        rs.getString("HoraEmissao"),
                        rs.getInt("TranspCod"));
                lista.add(nf);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (lista);
    }
}
