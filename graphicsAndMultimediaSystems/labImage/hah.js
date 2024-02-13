var img=document.getElementById('image1');
var canvas=document.getElementById("draw");
var x=canvas.getContext("2d");
x.drawImage(img,10,10);

var img2 = new Image();
img2.addEventListener(
  "load",
  function () {
    canvas.width = img2.width;
    canvas.height = img2.height;
    x.drawImage(img2,10,10);
  },
  false,
);
img2.src = "snail.bmp";
let d3 = document.querySelector(".d3");
d3.appendChild(img2);


let BtnEle = document.querySelector("button");
   BtnEle.addEventListener("click", () => {
      fetch("snail.bmp")
      .then(function (response) {
         return response.blob();
      })
      .then(function (blob) {
        var a = document.getElementById("linkForSavingFiles");
        var file = blob;
        a.href = URL.createObjectURL(file);
        a.download = 'file.bmp';
        a.click();
      });
   });

   function saveFile(){
    fetch("snail.bmp")
    .then(function (response) {return response.blob();})
    .then(function (blob) {
      var a = document.getElementById("linkForSavingFiles");
      var file = blob;
      a.href = URL.createObjectURL(file);
      a.download = 'file.bmp';
      a.click();
    });
 }
  //  function saveFile() {
  //   var data = document.getElementById('input').value;
  //   var a = document.getElementById("linkForSavingFiles");
  //   var file = new Blob([data], {
  //     type: 'plain/text'
  //   });
  //   a.href = URL.createObjectURL(file);
  //   a.download = 'file.txt';
  //   a.click();
  // }

// let button = document.querySelector("button");
// button.onclick = function(){
//   URL.createObjectURL(new Blob);
// }
