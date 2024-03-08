

let myButton = document.querySelector("button");
let myHeading = document.querySelector("h1");

function setUserName() {
    const myName = prompt("Please enter your name.");
    localStorage.setItem("name", myName);
}


myButton.onclick = () => {
    if (!localStorage.getItem("name")) {
        setUserName();
      } else {
        const storedName = localStorage.getItem("name");
        myHeading.textContent = `Mozilla is cool, ${storedName}`;
      }
  };