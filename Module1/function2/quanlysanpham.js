let products = ["Sony Xperia","Iphone 14","Samsung"];
function displayAllProduct() {
    let table = "<table>"
    table += "<tr>"
    table += "<td><b>Product name</b></td>"
    table += "<td colspan='2' style='color: red; text-align: right'>" + products.length + " products</td>"
    table += "</tr>"
    for (let i = 0; i < products.length; i++) {
        table += "<tr>"
        table += "<td>" + products[i] + "</td>"
        table += "<td><button onclick='updateProduct(" + i + ")'>Edit</button></td>"
        table += "<td><button onclick='deleteProduct(" + i +")'>Delete</button></td>"
        table += "</tr>"
    }
    table += "</table>"
    document.getElementById("display").innerHTML = table
    // table += "<td><button onclick='deleteProduct(" là 1 chuỗi nếu không cộng chuỗi thêm thì máy sẽ hiểu là i thôi chứ ko phải số i
}
function createProduct() {
    let newProduct = document.getElementById('input').value;
    products.push(newProduct);
    document.getElementById('input').value = "";
    displayAllProduct();
}
function deleteProduct(index){
    if (confirm("Are you sure you want to delete this product?")){
        products.splice(index, 1);
        displayAllProduct();
        }
}
function updateProduct(index){
    let newProduct = prompt("Enter the product name you want to update: ");
    if (newProduct!== ''&& newProduct!=null){
        products[index] = newProduct;
    }
    displayAllProduct()
}
displayAllProduct()
