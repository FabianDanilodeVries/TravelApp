function registerNewUser(){
    let apiURL = "user/createNewUser";
    userName= document.getElementById("userNameRegister").value;
    let email = document.getElementById("emailRegister").value;
    let password = document.getElementById("passwordRegister").value;
    let newUser = '{"userName":"'+ userName + '", "email": "'+ email + '", "password": "' + password + '"}';
    let xhttp = new XMLHttpRequest();
        // xhttp.onreadystatechange = function(){
        //     if(this.readyState == 4 && this.status == 202){
        //         document.getElementById("newUser").innerHTML = this.responseText;
        //     }
        // }
    xhttp.open("POST", "http://localhost:8082/"+ apiURL, true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(newUser);
    //    window.location.href = "http://localhost:8082/"+ apiURL;
    document.getElementById("successfullCreation").innerHTML = "Congratulations, you have successfully created an account, Please log in below."
}

function logIn(){
    let apiURL = "user/logIn";
    let userName = document.getElementById("userNameLogIn").value;
    let password = document.getElementById("passwordLogIn").value;
    let logInData = '{"userName":"'+ userName + '","password": "'+ password + '"}';
    let xhttp = new XMLHttpRequest();
         xhttp.onreadystatechange = function(){
            console.log(this.status);
            if(this.status == 401){
                document.getElementById("logInFailureMessage").innerHTML = `<div>"Invalid credentials, please try again"</div>`;
            }else if(this.status == 200){
                    passValues();

                   window.location.href = 'http://localhost:8082/User.html';

            }
         }
        xhttp.open("POST", "http://localhost:8082/"+ apiURL, true);
                xhttp.setRequestHeader("Content-type", "application/json");
                xhttp.send(logInData);
}

//function showAllCountriesVisited(){
//    let apiURL = "HLVisit/showAllCountries";
//    userName = document.getElementById("userNameLogIn").value;
//    let password = document.getElementById("passwordLogIn").value;
//    let logInData = '{"userName":"'+ userName + '","password": "'+ password + '"}';
//    let xhttp = new XMLHttpRequest();
//         xhttp.onreadystatechange = function(){
//            console.log(this.status);
//            if(this.status == 401){
//                document.getElementById("logInFailureMessage").innerHTML = `<div>"Invalid credentials, please try again"</div>`;
//            }else if(this.status == 200){
//                   window.location.href = 'http://localhost:8082/User.html';
//            }
//         }
//        xhttp.open("POST", "http://localhost:8082/"+ apiURL, true);
//                xhttp.setRequestHeader("Content-type", "application/json");
//                xhttp.send(logInData);}
//


function showPassword(id) {
  var x = document.getElementById(id);
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}

function passValues(){
    var getUsername = document.getElementById("userNameLogIn").value;
    localStorage.setItem("userLoggedIn", getUsername);

    return false;
}

function localStorageUserId() {
    const http = new XMLHttpRequest();
    const url="http://localhost:8082/user/getUserId/"+ localStorage.getItem("userLoggedIn");
    http.open("GET", url);
    http.send();

    http.onreadystatechange = (e) => {
    localStorage.setItem("userLoggedInId", http.responseText);
    console.log(localStorage.getItem("userLoggedInId"));
    loadVisits()
//     document.getElementById("showRestaurants").innerHTML = Http.responseText;
    }
}

function localStoreChosenRestaurantIdAndName(restId, restName){
    console.log(restId);
    console.log(restName);
    localStorage.setItem("chosenRestaurantId", restId);
    localStorage.setItem("chosenRestaurantName", restName);
    console.log(restId);
    console.log(restName);
    displayAddRestaurantInputFields();
}



//function fwefew(){
//    var apiURL  = "/user/getUserId/";
//    var userName = localStorage.getItem("userLoggedIn");
//    console.log(userName);
//    console.log("http://localhost:8082"+apiURL+userName);
//
//    var xhr = new XMLHttpRequest();
//    xhr.onreadystatechange = function(){
//        console.log("here2");
//        if (xhr.readyState === XMLHttpRequest.DONE) {
//            if (xhr.status === 'OK' || (xhr.status >= 200 && xhr.status < 400)) {
//                var inhoudDB = JSON.parse(this.responseText);
//
////                var visitString = "";
////                for (x=0; x<inhoudDB.length; x++) {
////                    console.log(inhoudDB[x]);
////
//    //                      restaurantstring +=
//    //                      `
//    //                      <div>${inhoudDB[x].name}</div>
//    //                      `;
////                      }
//    //                  document.getElementById("newdiv").innerHTML = restaurantstring;
//            }
//        }
//        xhr.open("GET", "http://localhost:8082"+apiURL +userName, true);
//        xhr.send();
//    }
//}



function loadVisits(){
//           var logInId = localStorage.getItem("userLoggedInId");
//           console.log(logInId);
//           var apiURL  = "HLVisit/findUserHLVisits/" + logInId;
//           var xhr = new XMLHttpRequest();
//           xhr.onreadystatechange = function(){
//               if (xhr.readyState === XMLHttpRequest.DONE) {
//                   if (xhr.status === 'OK' || (xhr.status >= 200 && xhr.status < 400)) {
//                         var inhoudDB = JSON.parse(this.responseText);
//                         console.log("VERSTUREN GET Restaurants GELUKT!");
//                         var visitString = "";
////                         for (x=0; x<inhoudDB.length; x++) {
////                           console.log(inhoudDB[x]);
//
//       //                      restaurantstring +=
//       //                      `
//       //                      <div>${inhoudDB[x].name}</div>
//       //                      `;
////                         }
//       //                  document.getElementById("newdiv").innerHTML = restaurantstring;
//                   } else{
//                         console.log("VERSTUREN GET EMPLOYEE IS NIET GELUKT!");
//                   }
//               }
//           }
//           xhr.open("GET", "http://localhost:8082/"+apiURL, true);
//           xhr.send();
 }



 function showAllRestaurants(){
//    var logInId = localStorage.getItem("userLoggedInId");
//    console.log(logInId);
    var apiURL  = "Restaurant/ShowAllRestaurants";
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
        if (xhr.readyState === XMLHttpRequest.DONE) {
            if (xhr.status === 'OK' || (xhr.status >= 200 && xhr.status < 400)) {
                  var inhoudDB = JSON.parse(this.responseText);
                  console.log("VERSTUREN GET Restaurants GELUKT!");
                  var restaurantString = `<div class="modal fade" id="restaurantModal" tabindex="-1">
                          <div class="modal-dialog">
                              <div class="modal-content">
                                  <button type="button" class="close" data-dismiss="modal"><i class="icon-xs-o-md"></i></button>
                                  <div class="modal-header">
                                      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                      <h4 class="modal-title caps"><strong>Add Restaurant Visit</strong></h4>
                                  </div>
                                  <div class="modal-body">
                                      <div class="form-group">
                                          <div class="input-group">`;
//                  console.log(xhr.responseText);
                 for (x=0; x<inhoudDB.length; x++) {
//                   console.log(inhoudDB[x]);
                   var count = 0;
                    restaurantString +=

                        `<label class="control-label col-md-4"><strong>Name:</strong></label>
                        <input type="text" class="form-control" id="restModalname" value= ${inhoudDB[x].restaurantName} disabled />
                        <label class="control-label col-md-4"><strong>Address:</strong></label>
                        <input type="text" class="form-control" id="restModalAddress" value= ${inhoudDB[x].restaurantAddress} disabled/>
                        <label class="control-label col-md-4"><strong>Country:</strong></label>
                        <input type="text" class="form-control" id="restModalCountry" value= ${inhoudDB[x].country} disabled/>
                        <label class="control-label col-md-4"><strong>Average rating:</strong></label>
                        <input type="text" class="form-control" id="restModalAverageRating" value= ${inhoudDB[x].restaurantAverageRating} disabled/>
                        <label class="control-label col-md-4"><strong>Restaurant type:</strong></label>
                        <input type="text" class="form-control" id="restModalRestaurantType" value= ${inhoudDB[x].restaurantType} disabled/>
                        <label class="control-label col-md-4"><strong>Number of tables:</strong></label>
                        <input type="text" class="form-control" id="restModalNumberOfTables" value= ${inhoudDB[x].numberOfTables} disabled/>
                        <label class="control-label col-md-4"><strong>Vegetarian options:</strong></label>
                        <input type="text" class="form-control" id="restModalVegetarianOptions" value= ${inhoudDB[x].vegetarianOptions} disabled/>
                        <!--                        <span class="input-group-btn"><button class="btn btn-default" type="button">Action</button></span>-->
                        `;

                        var tempRestId = inhoudDB[x].restId;
                        var tempRestName = inhoudDB[x].restaurantName;
                        restaurantString +=
                        `<button type="button" class="btn btn-info" onclick="localStoreChosenRestaurantIdAndName('${tempRestId}','${tempRestName}')" data-dismiss="modal">Select</button>
                        <hr><hr>`;
//                        <span class="input-group-btn"><button class="btn btn-default" type="button">Select Restaurant onclick="localStoreChosenRestaurantIdAndName(${tempRestId},${tempRestname})"</button></span>`;
//                            `<div>${inhoudDB[x].name}</div>
//                            <div>${inhoudDB[x].address}</div>
//                            <div>${inhoudDB[x].country}</div>
//                            <div>${inhoudDB[x].restaurantAverageRating}</div>
//                            <div>${inhoudDB[x].restaurantType}</div>
//                            <div>${inhoudDB[x].numberOfTables}</div>
//                            <div>${inhoudDB[x].vegetarianOptions}</div>
//                            </div>`;

//                    `<div>${inhoudDB[x].name}</div>`;
                 }
                 restaurantString += ` </div>
                                  </div>
                              </div>
                              <div class="modal-footer">
                                  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                  <!--                <button type="button" class="btn btn-info" data-toggle="modal" data-target="#accommodationModal" data-dismiss="modal"></button>-->
                                  <!--                <button type="button" class="btn btn-default" data-toggle="modal" data-target="#demo-3" data-dismiss="modal">Close current, Launch Modal #3</button>-->
                              </div>
                          </div>
                      </div>
                  </div>`;
                  document.getElementById("openModalHere").innerHTML = restaurantString;

            } else{
                  console.log("VERSTUREN GET EMPLOYEE IS NIET GELUKT!");
            }

        }
    }
    xhr.open("GET", "http://localhost:8082/"+apiURL, true);
    xhr.send();
}

function displayAddRestaurantInputFields(){
    inputFieldString = "";
    inputFieldString += `<div>
        <form>
          <label for="restaurant">Restaurant [1-10]:</label><br>
          <input type="text" id="restaurant" name="restaurant" value="${localStorage.getItem("chosenRestaurantName")}"><br>
          <label for="comments">Notes:</label><br>
          <input type="text" id="comments" name="comments"><br>
          <label for="rating">Rating [1-10]:</label><br>
          <input type="text" id="rating" name="rating">
          <label for="date">Date:</label><br>
          <input type="text" id="date" name="date"></br>
        </form></div>
        `;
        document.getElementById("showAddRestaurantInputFields").innerHTML = inputFieldString;
}



