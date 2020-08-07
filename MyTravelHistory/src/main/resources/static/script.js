function registerNewUser(){
    let apiURL = "createAccount";
    let userName= document.getElementById("userName").value;
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let newUser = '{"userName":"'+ userName + '", "email": "'+ email + '", "password": "' + password + '"}';
    postData(apiURL,newUser);
}

function showAllRestaurants(){
    let apiURL = "showAllRestaurants";
    getData(apiURL);
}







function postData(apiURL, input){
    let xhttp = new XMLHttpRequest();
    // xhttp.onreadystatechange = function(){
    //     if(this.readyState == 4 && this.status == 202){
    //         document.getElementById("newUser").innerHTML = this.responseText;
    //     }
    // }    
    xhttp.open("POST", "http://localhost:8082/"+ apiURL, true);
            xhttp.setRequestHeader("Content-type", "application/json");
            xhttp.send(input);
}

function getData(apiURL){
    var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
              if (this.readyState == 4 && this.status == 200) {
                document.getElementById("newdiv").innerHTML = this.responseText;
              }
            };
    xhttp.open("GET", "http://localhost:8082/"+apiURL);
              xhttp.setRequestHeader("Content-type", "application/json");
              xhttp.send();
      }