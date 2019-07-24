const buildTable = (itemsArray,allItems)=>{
    console.log(itemsArray,allItems);
    let table = `<table id="table">
                    <tr>
                        <th>Item ID</th>
                        <th>Name Of Item</th>
                        <th>Category Of Item</th>
                        <th>Quantity</th>
                        <th>Price of One</th>
                        <th>Total Price</th>
                    </tr>
                `;
    let rows = ``;
    let total = 0;
    itemsArray.items.forEach((element)=>{
        allItems.Items.forEach((e)=>{
            if(element.id == e.id){
                rows += `<tr>
                    <td>${element.id}</td>
                    <td>${e.name}</td>
                    <td>${e.category}</td>
                    <td>${element.quantity}</td>
                    <td>${e.price}</td>
                    <td>${parseInt(e.price) * parseInt(element.quantity)}</td>
                </tr>
                `;
                total += parseInt(e.price) * parseInt(element.quantity);
            }
        });
    });
    table += rows;
    table +=    `</table>
                <div id="total">
                    Total is: ${total}
                </div>
                `;
    document.getElementById("checkOutTable").innerHTML = table;
}
const loadData= ()=>{
    let url = "http://localhost:3000/checkout/itemsBought";
    let currentItems;
    fetch(url,{
        headers:{
            token: localStorage.getItem("token")
        }
    })
    .then(response => response.json())
    .then(response => {
        currentItems = response.currentItems;
    })
    .then(() => {
        let url = "http://localhost:3000/database/getAllItems"
        let allItems;
        fetch(url,{
            headers:{
                "token" : localStorage.getItem("token")
            }
        })
        .then(response => response.json())
        .then((response)=> {
            allItems = response;
            buildTable(currentItems,allItems);

        });
    });

}

const viewBill = ()=>{
    //api call to send json data to server, which sends email as file after appended to it
    //redirect to new page and load a new bill page.
    let tableArray = [];
    let total = document.getElementById("total").innerText;
    table = document.getElementById("table");
    for (let i = 1; i < table.rows.length; i++) {
        tableArray.push({
            id : table.rows[i].cells[0].innerHTML,
            name: table.rows[i].cells[1].innerHTML,
            category : table.rows[i].cells[2].innerHTML,
            quantity : table.rows[i].cells[3].innerHTML,
            price : table.rows[i].cells[4].innerHTML,
            total : table.rows[i].cells[5].innerHTML
        });
    }
    let jsonObject = {
        tableArray : tableArray,
        total : total
    };
    let url = "http://localhost:3000/billing/getBill";
    fetch(url,{
        method: "POST",
        headers:{
            token : localStorage.getItem("token"),
            "content-type" : "application/json"
        },
        body: JSON.stringify(jsonObject)
    })
    .then(response => response.json())
    .then(()=>{
        document.location = "./Bill.html";
    });
}
