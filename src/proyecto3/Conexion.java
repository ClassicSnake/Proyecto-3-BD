/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import static javafx.scene.Cursor.cursor;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author George
 */
public class Conexion {
      
    
        DBCursor cursor = null;    
   
        MongoClient mongo = new MongoClient("localhost");
        MongoDatabase database = mongo.getDatabase("faceboot");

        MongoCollection<Document> collection = database.getCollection("usuarios");
        MongoCollection<Document> collection2 = database.getCollection("posts");
        MongoCollection<Document> collection3 = database.getCollection("comentarios");
      



        
        
      
}
