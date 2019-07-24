const API = require('express').Router();

API.get("/status",(request,response)=>{
    response.status(200).json({
        message: "Checkout API working"
    });
});

API.post("/items",(request,response)=>{
    
})

module.exports.checkoutAPI = API;