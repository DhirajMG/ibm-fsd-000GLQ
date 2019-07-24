//console.log("Hello world");
const express = require('express');
const expressServer = express();
const bodyParser = require('body-parser');
const cors = require('cors');
const PORT = 3000;
const databaseAPI = require("./APIs/databaseAPI").databaseAPI;
const checkoutAPI = require("./APIs/checkoutAPI").checkoutAPI;
const validate = require("./Services/securityService").validate;
const generateToken = require("./Services/securityService").generateToken;

expressServer.use(bodyParser.json());
expressServer.use(cors());

expressServer.use('/database',(request,response,next)=>{
    validate(request,response,next);
});
expressServer.use("/checkout",(request,response,next)=>{
    validate(request,response,next);
});
expressServer.use("/checkout",checkoutAPI);
expressServer.use("/database",databaseAPI);//database read apis
//expressServer.use();//checkout apis

expressServer.post("/generateToken",(request,response)=>{
    response.status(200).json({
        token : generateToken(request.body.name,request.body.email,request.body.password)
    });
});

expressServer.get("/status",(request,response)=>{
    response.status(200).json({
        message: "Server working"
    });
});

expressServer.get('/unauthorize',(request,response)=>{
    response.status(401).json({
        message : 'Unauthorized Access - Not allowed'
    });
});

expressServer.listen(PORT,()=>{
    console.log(`Server has started on PORT = ${PORT}`);
});