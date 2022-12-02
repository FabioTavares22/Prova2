

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

	list.unshift({"value1":value1, "value2": value2 });
	setList(list);
}

var escolhido = list.value;


console.log('implements')