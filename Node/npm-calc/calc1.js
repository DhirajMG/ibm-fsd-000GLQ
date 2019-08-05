const express = require('express');
const server = express();
const parser = require('body-parser');

server.use(parser.json());

server.get('/status',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(
        JSON.stringify({
            message : "Calculator service is running"
        }));
});

server.get('/calculate/:operand/:num1/:num2',(req,res)=>{
    if(req.params.operand == '+'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) + parseInt(req.params.num2)
    }))
}
    if(req.params.operand == '-'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) - parseInt(req.params.num2)
    }))
}
    if(req.params.operand == '*'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) * parseInt(req.params.num2)
    }))
}
    if(req.params.operand == '/'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) / parseInt(req.params.num2)
    }));
}
    
});

const PORT = 7777;
server.listen(PORT,()=>{
    console.log(`Server is running at ${PORT}`);
});