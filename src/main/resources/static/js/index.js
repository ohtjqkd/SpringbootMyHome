function init() {
  fetch("/find/all")
    .then((res) => {
      return res.text();
    })
    .then((res) => {
      console.log(res);
      document.querySelector("#item-list").innerHTML = res;
    });
}

document.addEventListener("DOMContentLoaded", init());
