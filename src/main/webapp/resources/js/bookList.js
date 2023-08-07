const list = document.getElementById("list");

list.addEventListener("click", function(){
   
    console.log("list");
    let xhttp = new XMLHttpRequest();

    //open("메서드형식", "url")
    xhttp.open("GET", "./list?page=1");

    xhttp.send();

    xhttp.onreadystatechange = function(){
     
          if(this.readyState==4 && this.status==200){ //잘왔다
                console.log(this.responseText); //응답데이터
          }
        
    }


})