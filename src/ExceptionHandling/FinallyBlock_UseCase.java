package ExceptionHandling;

public class FinallyBlock_UseCase {
	
	//DB 
	//make the connection - DB - unserName/pwd/ip:port
	//hit the SQL Query
	
		//try
	//get the results -- this might give the exceptions - file not found, data not found
		//catch()	
		
		//finally
	//Closing the connection is important - finally 
		//even though exception is handled or not - we have to close the DB connection
	
	//use the results in our script 
	
	
	
	//User is logged into Amazon.com 
	//User --> app server --> DataBase Server 
		//User is performing search operation, so app server is establishing a connection with dataBase Server
		//while getting the search result some of the user, for eg. out of 50,000, 10,000 users got connection failure issue internally
		//But don't we think that we already established a connection to the dataBase Server 
		//if we are not closing the connection
		//LET'S SAY USER LOGGED OUT
		//but in the back end server is already connected to the dataBase(connection is open)
			//User might logged out but unnecessary connections were still open in the back end 
		//in this case, we have to write finally block here - close the connection
	
		

}
