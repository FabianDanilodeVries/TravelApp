function postData(apiURL, input){
   let xhttp = new XMLHttpRequest();
   console.log(input);
   // xhttp.onreadystatechange = function(){
   //     if(this.readyState == 4 && this.status == 202){
   //         document.getElementById("newUser").innerHTML = this.responseText;
   //     }
   // }
   xhttp.open("POST", "http://localhost:8082/"+ apiURL, true);
           xhttp.setRequestHeader("Content-type", "application/json");
           xhttp.send(input);
}


function registerNewAccommodation(){
   let apiURL = "user/addNewAccommodation";
   let accommodationName= document.getElementById("accommodationName").value;
   let accommodationAddress = document.getElementById("accommodationAddress").value;
   let accommodationType = document.getElementById("accommodationType").value;
   let numberOfRooms = document.getElementById("numberOfRooms").value;
   let newAccommodation = '{"accommodationName": "' + accommodationName + '", "accommodationAddress": "' + accommodationAddress + '", "accommodationType": "' + accommodationType + '", "numberOfRooms": ' + numberOfRooms + '}';
   postData(apiURL,newAccommodation);
}

function showAllAccommodations() {
   const Http = new XMLHttpRequest();
   const url='http://localhost:8082/user/showAllAccommodations';
   Http.open("GET", url);
   Http.send();

   Http.onreadystatechange = (e) => {
       document.getElementById("accommodationdiv").innerHTML = Http.responseText;
   }
}


