package demo.service;




import demo.bean.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrien on 11/03/2015.
 */
@Component
public class ClientService {

    public void addClient (String nom, String prenom){
//        String url = null;
//        // Connecting from App Engine.
//        // Load the class that provides the "jdbc:google:mysql://"
//        // prefix.
//        try {
//            Class.forName("com.mysql.jdbc.GoogleDriver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        url = "jdbc:google:mysql://model-folio-87421:spring-boot-demo-bdd?user=root";
//
//
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(url);
//            ResultSet rs = conn.createStatement().executeQuery("INSERT INTO CLIENT VALUES ("+nom+","+prenom+")");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    };

    public List<Client> getClients (){
		List<Client> clients = new ArrayList<>();

		List<demo.persistence.beans.biz.Client> clientsBiz  = demo.persistence.beans.biz.Client.getList();

		for(demo.persistence.beans.biz.Client client : clientsBiz){
			clients.add(new Client(client.getNom(),client.getPrenom()));
		}

        return clients;
    };

}
