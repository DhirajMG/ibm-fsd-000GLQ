const onLoadBill = ()=>{
    url = "http://localhost:3000/billing/generate";
    //generate bill in table form
    fetch(url,{
        headers:{
            token : localStorage.getItem("token")
        }
    }).then(response => response.json())
    .then((jsonObject)=>{
        let table = `<table>
                        <tr>
                            <th>Name</th>
                            <th>Quantity</th>
                            <th>Price</th>
                            <th>Total</th>
                        </tr>
                    `;
        let rows = ``;

        jsonObject.tableArray.forEach(element => {
            rows += `<tr>
                        <td>${element.name}</td>
                        <td>${element.quantity}</td>
                        <td>${element.price}</td>
                        <td>${element.total}</td>
                    </tr>`;
        });

        table += rows;
        table += `</table>
                    <p>${jsonObject.total}</p>    
                    `;
        document.getElementById("bill").innerHTML = table;
        return table;
    }).then(table => {
        console.log(table);
        url = "http://localhost:3000/billing/sendMail";
        fetch(url,{
            method : "POST",
            headers:{
                "content-type" : "application/json",
                token : localStorage.getItem("token")
            },
            body : JSON.stringify({
                "tableHTML" : `${table}`,
                "email" : localStorage.getItem("email")
            })
        })
        .then(response => response.json())
        .then(()=>{
            console.log("Clearing local storage");
            localStorage.removeItem("token");
            localStorage.removeItem("email");
        });
    });
}
