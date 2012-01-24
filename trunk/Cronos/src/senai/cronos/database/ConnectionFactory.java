package senai.cronos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import senai.cronos.logica.Preferencias;

/**
 * Classe que fabrica uma conexao lendo as configuracoes do arquivo
 * connection.properties
 *
 * @author Sergio Lisan
 */
public class ConnectionFactory {

    ConnectionFactory() {
        Properties pp = Preferencias.instance().getConexao();
        user = pp.getProperty("user");
        passwd = pp.getProperty("passwd");
        url = pp.getProperty("url");
        driver = pp.getProperty("driver");
    }

    /**
     * retorna uma conexao com o banco de dados
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    Connection getConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection(url, user, passwd);
    }
    
    private String user;
    private String passwd;
    private String url;
    private String driver;
    private Connection con;
}
