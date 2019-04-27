var http = require('http');
 
var server = http.createServer(function handler(req, res) {
    res.writeHead(200, {'Content-Type': 'text/plain'});
    
    
    var fs = require('fs');
    fs.readFile('D:\\nodeexamples\\hello.txt', 'utf8', function(error, data) {
        if (error) {
            console.log('Error:- ' + error);
            throw error;
        }
        res.end(data);
    });
    
    var mongoClient = require('mongodb').MongoClient;
   

    
});
 
server.listen(9000);
console.log('Server running at http://127.0.0.1:9000/');