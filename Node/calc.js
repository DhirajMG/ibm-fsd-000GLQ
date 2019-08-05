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
    if(req.params.operand == '+')
    {
    res.end(
        JSON.stringify({
           result : parseInt(req.params.num1) + parseInt(req.params.num2)
        }));
    }
    if(req.params.operand == '-')
    {
    res.end(
        JSON.stringify({
           result : parseInt(req.params.num1) - parseInt(req.params.num2)
        }));
    }
    if(req.params.operand == '*')
    {
    res.end(
        JSON.stringify({
           result : parseInt(req.params.num1) * parseInt(req.params.num2)
        }));
    }
    if(req.params.operand == 'div')
    {
    res.end(
        JSON.stringify({
           result : parseInt(req.params.num1) / parseInt(req.params.num2)
    }));
    }   
    if(req.params.operand == 'pow')
    {
    res.end(
        JSON.stringify({
           result : Math.pow(parseInt(req.params.num1),parseInt(req.params.num2))
        }));
    }
    if(req.params.operand == 'sqrt')
    {
    res.end(
        JSON.stringify({
           result : Math.sqrt(parseInt(req.params.num1))
        }));
    }        

});

const PORT = 3000;
server.listen(PORT,()=>{
    console.log(`Server started at ${PORT}`);
}
)