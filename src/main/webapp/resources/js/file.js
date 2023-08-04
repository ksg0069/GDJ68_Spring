{/* <div class="mb-3 ">
<label for="pic" class="form-label">사진첨부</label>
<input type="file" class="form-control" id="pic" name="photos">  
</div> */}

const fileList = document.getElementById("fileList");
const fileAdd = document.getElementById("fileAdd");



let max=5;
let count=0;
let idx=0;

fileList.addEventListener("click", function(event){
    console.log(event.target);
    let cl = event.target.classList;
    console.log(cl);
    if(event.target.classList.contains("df") ){
        let deleteID = event.target.getAttribute("data-id");
        
        document.getElementById(deleteID).remove();
        count--;
    }

})


fileAdd.addEventListener("click", function(){

    if(count>=max){
        alert("최대 5개만 가능");
        return;
    }
    count++;

    //div
    let d = document.createElement("div");
    let c = document.createAttribute("class");
    c.value="mb-3";
    d.setAttributeNode(c);

    c = document.createAttribute("id");
    c.value="file"+idx;
    d.setAttributeNode(c);

    //label
    let l = document.createElement("label");
    let f = document.createAttribute("for");
    f.value="pic";
    l.setAttributeNode(f);

    f = document.createAttribute("class");
    f.value="form-label";
    l.setAttributeNode(f);

    f = document.createTextNode("사진첨부");
    l.appendChild(f);

    //input
    let i = document.createElement("input");
    let t = document.createAttribute("type");
    t.value="file";
    i.setAttributeNode(t);
   
    t = document.createAttribute("class");
    t.value="form-control";
    i.setAttributeNode(t);

    t = document.createAttribute("id");
    t.value="pic";
    i.setAttributeNode(t);

    t = document.createAttribute("name");
    t.value="photos";
    i.setAttributeNode(t);

    d.appendChild(l);
    d.appendChild(i);

    let s = document.createElement("span");
    let t1 = document.createTextNode("x");

    let a = document.createAttribute("class");
    a.value="df";
    s.setAttributeNode(a);
    s.appendChild(t1);

    a = document.createAttribute("data-id");
    a.value="file"+idx;

    s.setAttributeNode(a);
    d.appendChild(s);

    fileList.appendChild(d);

    idx++;
});




