
// let update = document.getElementById("update");
let del = document.getElementById("del");

//1. 함수 사용
function setBookNum(num){
    bookNum=bookNum;
}

// update.addEventListener("click", function(){
//     window.confirm("확인");
//     console.log(check);
// })


del.addEventListener("click", function(){

    let result = confirm("정말 삭제 할래?");

    if(result){

        let num = del.getAttribute("data-delete-num");
        let parameterName = del.getAttribute("data-delete-name");
        location.href="./delete?"+parameterName+"="+ num;

        
    }
    
})

