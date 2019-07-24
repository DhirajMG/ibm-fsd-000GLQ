//const generateToken = require("");
let itemArray = {items:[]};
const authenticate = ()=>{
    url = "http://localhost:3000/generateToken";
    fetch(url,{
        method: "POST",
        headers: {
            "content-type":"application/json"
        },
        body: JSON.stringify({
            name: document.getElementById("name").value,
            email: document.getElementById("email").value,
            password: document.getElementById("password").value
        })
    })
    .then(response => response.json())
    .then((response)=>{
        token = response.token;
        localStorage.setItem("token",token);
        createTable(token);
    });
}
const createTable = (token)=>{
    console.log("Reached BuyItems.js file");
    let url = "http://localhost:3000/database/getAllItems"
    if(token == null){
        token = localStorage.getItem("token");
    }
    if(token != null){
        fetch(url,{
            headers:{
                "token": token
            }
        })
        .then(response => response.json())
        .then((data)=>{
            generateTable(data);
        });
    }     
}
const updateCart = (itemID)=>{
    itemArray.items.push({
        id: itemID,
        quantity: 1
    });
    sessionStorage.setItem("item",JSON.stringify(itemArray));
    document.getElementById("checkout").value = parseInt(document.getElementById("checkout").value) + 1;
}
const generateTable = (data)=>{
    let rows = "";
    console.log(data);
    data.Items.forEach(element => {
        rows += `<tr>
                    <td>${element.id}</td>
                    <td>${element.name}</td>
                    <td>${element.category}<td>
                    <td>${element.price}</td>
                    <td><input type="button" onclick="updateCart(${element.id})" value = "ADD"></input></td>
                </tr>`;
    });
    let table = `<table>
                    <tr>
                        <th>Item ID</th>
                        <th>Item Name</th>
                        <th>Item Category</th>
                        <th>Item Price</th>
                        <th>Add to cart</th>
                    </tr>
                    ${rows}
                </table>`;//add to cart must be an input button
    document.getElementById("tableOfAllItems").innerHTML = table;
}
const onClickCheckout = ()=>{
    //fetch api to store items in variable
    let items = sessionStorage.getItem("items");
    let url = "http://localhost:3000/checkout/items";
    fetch(url,{
        method: "POST",
        headers: {
            token: localStorage.getItem("token")
        },
        body: JSON.stringify(items)
    });
    //redirect to next page
    document.location = "./Checkout.html";
    //functionality for other buttons //done
}
