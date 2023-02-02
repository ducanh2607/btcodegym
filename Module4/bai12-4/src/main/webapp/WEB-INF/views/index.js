function getAllPhone(){
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/smartphones",
        success: function (a){
            let content = '<table border="1"><tr>\n'+
                '        <td>Procedure</td>\n'+
                '        <td>Model</td>\n'+
                '        <td>Price</td>\n'+
                '        <td colspan="2">Action</td>\n'+
                '     </tr>';
            for (let i = 0; i <a.length; i++){
                content += displayPhone(a[i]);
            }
            content += '</table>'
            document.getElementById('list_phone').innerHTML = content
        }
    })
}
function displayPhone(phone){
    return `<tr><td>${phone.procedures}</td><td>${phone.model}</td><td>${phone.price}</td>
    <td><button onclick="deletePhone(${phone.id})">Delete</button></td>
    <td><button onclick="updatePhone(${phone.id})">Update</button></td></tr>`
}
let idUpdate;
function updatePhone(id){
    idUpdate = id
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/smartphones/" + id,
        success: function (data) {
            $("#proceduce1").val(data.procedures)
            $("#model1").val(data.model)
            $("#price1").val(data.price)
            document.getElementById("update").hidden = false
        }
    });
}
function update(){
    let procedures = $("#proceduce1").val()
    let model = $("#model1").val()
    let price = $("#price1").val()
    let newPhone = {
        id: idUpdate,
        procedures: procedures,
        model: model,
        price: price
    }
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "PUT",
        url: "http://localhost:8080/smartphones/" + idUpdate,
        data: JSON.stringify(newPhone),
        success: function(data){
            getAllPhone()
            if (data.procedures != null){
                alert("Change successfully!")
            }
            document.getElementById("update").hidden = true;
        }
    })
    event.preventDefault();
}
function deletePhone(id){
    if(confirm("Are you sure want to delete?")){
        $.ajax({
            type: "DELETE",
            url: "http://localhost:8080/smartphones/"+ id,
            success: function(data){
                getAllPhone()
                alert(data)
            }
        });
    }
}
function createPhone(){
    let procedures = $("#proceduce").val()
    let model = $("#model").val()
    let price = $("#price").val()
    let newPhone = {
        procedures: procedures,
        model: model,
        price: price
    }
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        url: "http://localhost:8080/smartphones",
        data: JSON.stringify(newPhone),
        success: function(data){
            getAllPhone()
            if(data.procedures != null){
                alert("Create successfuly!")
            }
            document.getElementById("create").hidden = true
        }
    })
    event.preventDefault();
}
function displayCreateForm(){
    document.getElementById("create").hidden = false
}