const key = require("../Keys/key").key;
const jwt = require('jsonwebtoken');
const validateToken = (token)=>{
    let isValid = false;
    try{
        isValid = jwt.verify(token,key);
    }catch(error){
        console.error(error);
    }   
    return isValid;
}
const validate = (request,response,next)=>{
    const token = request.headers.token;
    if(token){
        const isValid = validateToken(token);
        if(isValid){
            next();
        }else{
            response.redirect('/unauthorize');
        }
    }else{
        response.redirect('/unauthorize');
    }
}
const generateToken = (name,email,pass)=>{
    if(name=="user123" && pass=="admin"){
        let data = {
            name: name,
            email: email
        };
        const token = jwt.sign(data,key,{
            expiresIn : "24h"
        });
        return token;
    }
    else {
        console.log("Wrong credentials");
        return null;
    }
}

module.exports = {
    validate,
    generateToken
}