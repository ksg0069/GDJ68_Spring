// id : 비어 x, 10초과 x , 입력이 끝나고 난후 검증 
// pw : 비어 x, 6글자이상 12미만 , 입력이 끝나고 난후 검증
// pw2 : pw와 같은지 판별, 글자를 입력할 때 마다 검증
// name : 비어 x ,입력이 끝나고 난후 검증
// email : 비어 x, 입력이 끝나고 난후 검증
// birth : 비어 x, 회원가입 버튼을 클릭 했을 때

// 회원가입 버튼을 그냥 버튼으로 바꿈 .

const id = document.getElementById("id");
const pw = document.getElementById("pw");
const pw2 = document.getElementById("pw2");
const names = document.getElementById("name");
const email = document.getElementById("email");
const birth = document.getElementById("birth");
const btn = document.getElementById("btn");
const frm = document.getElementById("frm");

let flag = true;

let idCheckResult=false;
let pwCheckResult=false;
let pw2CheckResult=false;
let nameCheckResult=false;
let emailCheckResult=false;

let checkResults= [false,false,false,false,false,false];


//1 id
id.addEventListener("blur", function(){
    
    console.log(id.id);
    const idResult = document.getElementById("idResult");

    if(id.value == '' || id.value.length > 10){
        idResult.innerHTML="id는 비어있으면 x, 10글자미만";
        idResult.className="f";
        checkResults[0]=false;
     
    }else{
        idResult.innerText="올바른 아이디 입니다";
        idResult.className="s";
        checkResults[0]=true;

    }
    // if(id.value.length == 0){

    //     d1.innerText="아이디를 입력하세요";
    //     flag = false;
        
    // }else if( id.value.length > 10){
    //     d1.innerText="아이디가 10글자이상 되면 안됩니다";
    //     flag = false;

    // }else{
    //     d1.innerText="";
    //     flag = true;
    // }
    
});

// pw : 비어 x, 6글자이상 12미만 , 입력이 끝나고 난후 검증
pw.addEventListener("blur", function(){

    const pwResult = document.getElementById(pw.id+"Result");

    if(pw.value.length >5 && pw.value.length<12){

        pwResult.innerHTML="올바른 비번";
        pwResult.className="s";
        checkResults[1]=true;

    }else{

        pwResult.innerHTML="비번은 6글자이상 12글자 미만";
        pwResult.className="f";
        checkResults[1]=false;

    }

    pw.addEventListener("change", function(){

        pw2.value="";
        checkResults[2]= false;
        pw2Result.innerHTML="";
    
    });
    // if(pw.value.length < 6 || pw.value.length >= 12 ){

    //     d2.innerText="6개이상 12개미만으로 적어주세요";
    //     flag = false;

    // }else if(pw.value.length==0){

    //     d2.innerText="pw를 입력하세요";
    //     flag = false;

    // }else{
    //     d2.innerText="";
    //     flag = true;
    // }
    
  
   
});

// pw2 : pw와 같은지 판별, 글자를 입력할 때 마다 검증
pw2.addEventListener("keyup", function(){

    const pw2Result = document.getElementById("pw2Result");

    if(pw2.value == pw.value){
        pw2Result.innerHTML="비밀번호가 같다";
        pw2Result.className="s";
        checkResults[2]=true;


    }else{
        pw2Result.innerHTML="비밀번호 틀리다";
        pw2Result.className="f";
        checkResults[2]=false;
    }



    // if(pw.value != pw2.value ){

    //     d3.innerText="비번이 같지않아요";
    //     flag = false;

    // }else if(pw.value == pw2.value){

    //     d3.innerText="비번이 같아요";
    //     flag = false;

    // }else{
    //     d3.innerText="";
    //     flag = true;
    // }
    

});

// 비어있는지 체크하는 함수
function emptyCheck(element){ 
    
    if(element.value == ""){
        return true;
    }else{
        return false;
    }
}

//// name : 비어 x ,입력이 끝나고 난후 검증


names.addEventListener("blur", function(){

    const nameResult = document.getElementById("nameResult");

    let check = emptyCheck(names);
    nameResult.innerHTML="비어 있으면 안됩니다";
    nameResult.className='f';
    checkResults[3]=false;

    if(!check){
        nameResult.innerHTML="OK";
        nameResult.className="s";
    checkResults[3]=true;

    }

    // const nameResult = document.getElementById("nameResult");
    // if(name.value.length == 0){

    //     d4.innerText="이름을 입력하세요 입력하세요";
    //     flag = false;
        
    // }else{
    //     d4.innerText="";
    //     flag = true;
    // }
    
  
   
});

// email : 비어 x, 입력이 끝나고 난후 검증
email.addEventListener("blur", function(){

    const emailResult = document.getElementById("emailResult");

    let check = emptyCheck(email);
    emailResult.innerHTML="비어 있으면 안됩니다";
    emailResult.className='f';
    checkResults[4]=false;

    if(!check){
        emailResult.innerHTML="OK";
        emailResult.className="s";
        checkResults[4]=true;

    }
    // if(email.value.length == 0){

    //     d5.innerText="이메일을 입력하세요";
    //     flag = false;
        
    // }else{
    //     d5.innerText="";
    //     flag = true;
    // }
    
  
   
});

// birth : 비어 x, 회원가입 버튼을 클릭 했을 때
birth.addEventListener("change", function(){
    
    let check = emptyCheck(birth);
    const birthResult = document.getElementById("birthResult");
    
    birthResult.innerHTML="비어 있으면 안됩니다";
    birthResult.className='f';
    checkResults[5]=false;

    if(!check){
        birthResult.innerHTML="OK";
        birthResult.className="s";
        checkResults[5]=true;

    }
    // if(email.value==""){

    //     d6.innerText="생일 입력하세요";
    //     flag = false;
    // }else{
    //     d6.innerText="";
    //     flag = true;
    // }
  
   
});


btn.addEventListener("click", function(){

    let c = checkResults.includes(false);
    
    if(!c){
        //form 전송
        console.log("form 전송");
        // frm.submit();

    }else{
        alert("필수항목입력");
    }

});