var http = require('http');
 
var server = http.createServer(function handler(req, res) {
    res.writeHead(200, {'Content-Type': 'text/plain'});

    
    var mongoClient = require('mongodb').MongoClient;
    
    var url = 'mongodb://localhost:27017/angulardb';
     
    mongoClient.connect(url, function(err, db) {
        if (err) {
            console.log('Sorry unable to connect to MongoDB Error:', err);
        } else {
            console.log("Connected successfully to server", url);
            var collection = db.collection('employee');
      
            console.log("Print persons collection:- ");
      
            collection.find({}).toArray(function(err, employee) {
                console.log(JSON.stringify(employee, null, 2));
            });
      
            db.close();
        }
    });

    
});
 
server.listen(9000);
console.log('Server running at http://127.0.0.1:9000/');