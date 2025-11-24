const display = document.getElementById("display");

function append(input){
    display.value += input;
}
function compute(){
    try{
        display.value = Function("return " + display.value)();
    }
    catch{
        display.value = "Error";
    }
}


function clearDisplay() {
    display.value = "";
}
function backspace(){
    display.value = display.value.slice(0, -1);
}
document.addEventListener("keydown", (event) => {
    const key = event.key;

    if (!isNaN(key) || "+-*/.".includes(key)) {
        append(key);
    }
    if (key === "Enter") compute();
    if (key === "Backspace") backspace();
    if (key === "Escape") clearDisplay();
});

