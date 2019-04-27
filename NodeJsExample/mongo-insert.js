var http = require('http');

var server=http.createServer(function  handler(req, res){
	
	res.writeHead(200, {'Content-Type':'text/pain'});
	
	var mongoClient = require('mongodb').MongoClient;
	
	var url = 'mongodb://localhost:27017/angulardb';
	
	mongoClient.connect(url, function(err, db){
		if(err){
			console.log('unable to connect MongoDB: Error', err);
		}else{
			var collection=db.collection('employee');
			
			var a =  {
					id:6,
					name:"a",
					age:30
			        };
			var b = {
					id:7,
					name:"b",
					age:34
			};
		/*	collection.insertOne(a, {w:1}, function(err, records){
				
				console.log("record added:"+records);
				
			});
			
          collection.insertOne(b, {w:1}, function(err, records){
				
				console.log("record added:"+records);
				
			});
          
          collection.updateOne({
              "name": "a"
          }, {
              $set: {
                  "age": 45
              }
          }, function(err, results) {
              console.log(results.result);
          });
           */
          
          
          collection.deleteOne({
              "name": "a"
          }, function(err, results) {
              console.log(results.result);
          });


			db.close();
		}
	});
	
});
server.listen(9000);
console.log('Server running at http://127.0.0.1:9000/');