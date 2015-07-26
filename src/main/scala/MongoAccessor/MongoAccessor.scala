package MongoAccessor

import com.mongodb.casbah.Imports._


/**
 * Created by geo on 7/26/15.
 */
class MongoAccessor
{
  val client = MongoClient("localhost", 27017)
  val db = client.getDB( "testdb" )
  println( "Connected to mongo with collections : " + db.collectionNames() )

}
