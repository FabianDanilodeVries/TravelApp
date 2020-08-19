
function postData(apiURL, input){
    let xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8082/"+ apiURL, true);
            xhttp.setRequestHeader("Content-type", "application/json");
            xhttp.send(input);
}
function showAllRestaurants() {
    const Http = new XMLHttpRequest();
    const url='http://localhost:8082/Restaurant/ShowAllRestaurants';
    Http.open("GET", url);
    Http.send();

    Http.onreadystatechange = (e) => {
     document.getElementById("showRestaurants").innerHTML = Http.responseText;
    }
}

function getByRestaurantName() {
    const Http = new XMLHttpRequest();
    const url='http://localhost:8082/Restaurant/GetByName';
    Http.open("GET", url)
    Http.send();

    let input2 = document.getElementById("restaurantSearch").value;
    let restaurantDB = postData(url, input2);

    if (input2.localeCompare(restaurantDB)) {
       Http.onreadystatechange = (e) => {
            document.getElementById("searchRestaurant").innerHTML = "Restaurant information: ";
           let result = getByName(input2);
           document.getElementById("informationRestaurant").innerHTM = '{"userName":"'+ input2.restaurantName + '", "address": "'+ input2.restaurantAddress + '"}';


           }
    } else {
        alert("restaurant not found!")
    }

}