package datastructure;
import databases.ConnectToSqlDB;

import java.util.*;
public class UseMap {

	public static void main(String[] args) throws Exception {


		HashMap<Object, Object> map = new HashMap<>();
		map.put(2120, "ABU");
		map.put(2038, "RANA");
		map.put(8467, "BURI");


		Iterator<Object> mapIt = map.keySet().iterator();
		Object key;
		while (mapIt.hasNext()) {
			key = mapIt.next();
			System.out.println("KEY: " + key);
			System.out.println("VALUE: " + map.get(key));
		}


		String tableName = "`test_hash_map`";
		ConnectToSqlDB sql = new ConnectToSqlDB();






	}
}


