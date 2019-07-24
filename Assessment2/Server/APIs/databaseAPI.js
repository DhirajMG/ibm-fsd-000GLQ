const API = require('express').Router();
const ItemsClass = require("../Services/databaseService").ItemsClass;
const itemsClassObject = new ItemsClass();

API.get("/status",(request,response)=>{
    response.status(200).json({
        message: "Database API working"
    });
});
API.get("/getAllItems",(request,response)=>{
    response.status(200).json(itemsClassObject.getAllItemsToBuyFromDatabase());
});

module.exports.databaseAPI = API;