function registerNewUser(){
    let apiURL = "createAccount";
    let userName= document.getElementById("userName").value;
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let newUser = '{"userName":"'+ userName + '", "email": "'+ email + '", "password": "' + password + '"}';
    postData(apiURL,newUser);
}

function postData(apiURL, input){
    let xhttp = new XMLHttpRequest();
    // xhttp.onreadystatechange = function(){
    //     if(this.readyState == 4 && this.status == 202){
    //         document.getElementById("newUser").innerHTML = this.responseText;
    //     }
    // }    
    xhttp.open("POST", "http://localhost:8889/"+ apiURL, true);
            xhttp.setRequestHeader("Content-type", "application/json");
            xhttp.send(input);
}

function findUserByUserName() {
    let userName= document.getElementById("userName2").value;
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
      if (xhr.readyState === XMLHttpRequest.DONE) {
          if (xhr.status === 'OK' || (xhr.status >= 200 && xhr.status < 400)) {
              var inhoudDB = JSON.parse(this.responseText);
//              console.log("VERSTUREN GET Restaurants GELUKT!");
//              var userNameFound = "";
//              for (x=0; x<inhoudDB.length; x++) {
//                  userNameFound +=
//                  `
//                  <div>${inhoudDB[x].userName}</div>
//                  `;
//              }

              document.getElementById("newUser2").innerHTML = inhoudDB;
          } else {
//              console.log("VERSTUREN GET EMPLOYEE IS NIET GELUKT!");
          }
      }
  }
  xhr.open("GET", "http://localhost:8889/user/findByUserName/" + userName, true);
  xhr.send();
}


function showAllRestaurants() {  
  var xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function(){        
      if (xhr.readyState === XMLHttpRequest.DONE) {
          if (xhr.status === 'OK' || (xhr.status >= 200 && xhr.status < 400)) {
              var inhoudDB = JSON.parse(this.responseText);
              console.log("VERSTUREN GET Restaurants GELUKT!");
              var restaurantstring = "";
              for (x=0; x<inhoudDB.length; x++) {
                  restaurantstring +=
                  `
                  <div>${inhoudDB[x].address}</div>
                  `;
              }
              document.getElementById("newdiv").innerHTML = restaurantstring;
          } else {
              console.log("VERSTUREN GET EMPLOYEE IS NIET GELUKT!");
          }
      }
  }   
  xhr.open("GET", "http://localhost:8889/showAllRestaurants", true);
  xhr.send();   
}

function getByRestaurantName() {
    let restaurantName= document.getElementById("restaurantName").value;
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
      if (xhr.readyState === XMLHttpRequest.DONE) {
          if (xhr.status === 'OK' || (xhr.status >= 200 && xhr.status < 400)) {
              var inhoudDB = JSON.parse(this.responseText);
//              console.log("VERSTUREN GET Restaurants GELUKT!");
//              var userNameFound = "";
//              for (x=0; x<inhoudDB.length; x++) {
//                  userNameFound +=
//                  `
//                  <div>${inhoudDB[x].userName}</div>
//                  `;
//              }

              document.getElementById("restaurantName").innerHTML = inhoudDB;
          } else {
//              console.log("VERSTUREN GET EMPLOYEE IS NIET GELUKT!");
          }
      }
  }
  xhr.open("GET", "http://localhost:8889/restaurant/getByRestaurantName/" + restaurantName, true);
  xhr.send();
}






// function showAllRestaurants(){
//     let apiURL = "showAllRestaurants";
//     getData(apiURL);
// }
// function getData(apiURL){
//     var xhttp = new XMLHttpRequest();
//             xhttp.onreadystatechange = function() {
//               if (this.readyState == 4 && this.status == 200) {
//                 document.getElementById("newdiv").innerHTML = this.responseText;
//               }
//             };
//     xhttp.open("GET", "http://localhost:8082/"+apiURL);
//               xhttp.setRequestHeader("Content-type", "application/json");
//               xhttp.send();
//       }