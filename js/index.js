const start = () => {
    addData();
    saveListStorage();
}
var value1 = document.querySelector(btn1).value;
var value2 = document.querySelector(btn2).value;
var value3 = document.querySelector(btn3).value;
var value4 = document.querySelector(btn4).value;
var value5 = document.querySelector(btn5).value;
var value6 = document.querySelector(btn6).value;

var comp = [
    {
        "value1": "1", "value2": "1", "value3": "1", "value4": "1", "value5": "1", "value6": "1"
    }
]

function addData(){
	if(!validation()){
		return;
	}
	var value1 = document.getElementById("#btn1").value;
    var value2 = document.getElementById("#btn2").value;
    var value3 = document.getElementById("#btn3").value;
    var value4 = document.getElementById("#btn4").value;
    var value5 = document.getElementById("#btn5").value;
    var value6 = document.getElementById("#btn6").value;

	comp.unshift({"value1":value1, "value2": value2, "value3": value3,"value4": value4, "value5": value5, "value6": value6});
	setList(comp);
}

function saveListStorage(comp){
	var jsonStr = JSON.stringify(comp);
	localStorage.setItem("comp",jsonStr);
}

start();

console.log('implements')