package mongo.main;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class Main {

	public static void main(String[] args) throws UnknownHostException {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("mybd");
		for(String name: mongo.getDatabaseNames()){
			System.out.println(name);
		}
		DBCollection coll = db.getCollection("test");
		coll.insert(new BasicDBObject());
//		boolean auth = db.authenticate("username", "password".toCharArray());
//		System.out.println(auth);
	}
}
