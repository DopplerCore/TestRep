let myArray;
let file;
let myArray2;
let pixelArray;

let BMPImageInfo = {
  //BITMAPFILEHEADER
  endianType: ["Порядок байтов",1,2],
  fileSize: ["Размер файла",3,6],
  reservedBytes: ["Зарезервированные байты",7,10],
  pixelDataPos: ["Положение пиксельных данных",11,14],
  //BITMAPINFO
  bitmapinfoSize: ["Размер BITMAPINFO",15,18],
  rasterWidth: ["Ширина растра",19,22],
  rasterHeight: ["Высота растра и порядок строк",23,26],
  justOne: ["Тут 1",27,28],
  pixelSize: ["Кол-во бит на пиксель",29,30],
  pixelStoreMethod: ["Способ хранения пикселей",31,34],
  pixelDataSize: ["Размер пиксельных данных",35,38],
  pixelMeterHorizontal: ["Кол-во пикселей на метр по горизонтали",39,42],
  pixelMeterVertical: ["Кол-во пикселей на метр по вертикали",43,46],
  colorTableSize: ["Размер таблицы цветов в ячейках",47,50],
  colorTableCellNum: ["Кол-во используемых ячеек таблицы",51,54]
}

function getByteFile(){
  var byteFile;
  file = document.querySelector("input").files[0];
  file.arrayBuffer()
  .then((arrayBuffer)=>{
    byteFile = new Uint8ClampedArray(arrayBuffer);
  });
      console.log(byteFile.length);
  return 0;
}


function getByteInfo(array, firstByte, lastByte){
  var output = "";
  for(var i = lastByte-1; i>firstByte-2;i--) output += array[i].toString(2).padStart(8, '0');
  return output;
}

function createInfo(array,[output,firstByte,lastByte],intSystem){
  var info = getByteInfo(array,firstByte,lastByte);
  var superDiv = document.createElement("div");
  var div1 = document.createElement("div");
  var div2 = document.createElement("div");
  var div3 = document.createElement("div");
  div1.innerHTML = output+": ";
  div2.innerHTML = info;
  div3.innerHTML = "тобиш "+parseInt(info,2).toString(intSystem);
  superDiv.appendChild(div1);
  superDiv.appendChild(div2);
  superDiv.appendChild(div3);
  return superDiv;
}

let draw = function () {
  var ctx = document.getElementById("canvas").getContext("2d");
  var img = new Image();
  img.onload = function () {
    ctx.drawImage(img, 0, 0);let myArray;
    let file;
    let myArray2;
    
    let BMPImageInfo = {
      //BITMAPFILEHEADER
      endianType: ["Порядок байтов",1,2],
      fileSize: ["Размер файла",3,6],
      reservedBytes: ["Зарезервированные байты",7,10],
      pixelDataPos: ["Положение пиксельных данных",11,14],
      //BITMAPINFO
      bitmapinfoSize: ["Размер BITMAPINFO",15,18],
      rasterWidth: ["Ширина растра",19,22],
      rasterHeight: ["Высота растра и порядок строк",23,26],
      justOne: ["Тут 1",27,28],
      pixelSize: ["Кол-во бит на пиксель",29,30],
      pixelStoreMethod: ["Способ хранения пикселей",31,34],
      pixelDataSize: ["Размер пиксельных данных",35,38],
      pixelMeterHorizontal: ["Кол-во пикселей на метр по горизонтали",39,42],
      pixelMeterVertical: ["Кол-во пикселей на метр по вертикали",43,46],
      colorTableSize: ["Размер таблицы цветов в ячейках",47,50],
      colorTableCellNum: ["Кол-во используемых ячеек таблицы",51,54]
    }
    
    
    function getByteInfo(array, firstByte, lastByte){
      var output = "";
      for(var i = lastByte-1; i>firstByte-2;i--) output += array[i].toString(2).padStart(8, '0');
      return output;
    }
    
    function createInfo(array,[output,firstByte,lastByte]){
      var info = getByteInfo(array,firstByte,lastByte);
      var superDiv = document.createElement("div");
      var div1 = document.createElement("div");
      var div2 = document.createElement("div");
      var div3 = document.createElement("div");
      div1.innerHTML = output+": ";
      div2.innerHTML = info;
      div3.innerHTML = "тобиш "+parseInt(info,2);
      superDiv.appendChild(div1);
      superDiv.appendChild(div2);
      superDiv.appendChild(div3);
      return superDiv;
    }
    
    let draw = function () {
      var ctx = document.getElementById("canvas").getContext("2d");
      var img = new Image();
      img.onload = function () {
        ctx.drawImage(img, 0, 0);
        myArray = ctx.getImageData(0,0,img.width,img.height).data;
      };
      img.src = "snail.bmp";
      file = document.querySelector("input").files[0];
      file.arrayBuffer()
      .then((arrayBuffer)=>{
        myArray2 = new Uint8ClampedArray(arrayBuffer);
    
        var div3 = document.querySelector("#div3");
        div3.appendChild(createInfo(myArray2,BMPImageInfo.endianType));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.fileSize));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.reservedBytes));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelDataPos));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.bitmapinfoSize));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.rasterWidth));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.rasterHeight));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.justOne));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelSize));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelStoreMethod));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelDataSize));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelMeterHorizontal));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelMeterVertical));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.colorTableSize));
        div3.appendChild(createInfo(myArray2,BMPImageInfo.colorTableCellNum));
      });
    }
    
    let but = document.querySelector("button");
    but.onclick = draw;
    myArray = ctx.getImageData(0,0,img.width,img.height).data;
  };
  img.src = "snail.bmp";
  file = document.querySelector("input").files[0];
  file.arrayBuffer()
  .then((arrayBuffer)=>{
    myArray2 = new Uint8ClampedArray(arrayBuffer);
    var div3 = document.querySelector("#div3");
    div3.appendChild(createInfo(myArray2,BMPImageInfo.endianType,16));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.fileSize,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.reservedBytes,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelDataPos,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.bitmapinfoSize,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.rasterWidth,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.rasterHeight,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.justOne,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelSize,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelStoreMethod,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelDataSize,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelMeterHorizontal,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.pixelMeterVertical,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.colorTableSize,10));
    div3.appendChild(createInfo(myArray2,BMPImageInfo.colorTableCellNum,10));
    pixelArray = new Uint8ClampedArray(262144);
    var iterator = 0;
    var stroka = 255;
    for(var i=0;i<pixelArray.length/4*3;i+=3){
      pixelArray[iterator+stroka*1024]=myArray2[i+54+2];
      iterator++;
      pixelArray[iterator+stroka*1024]=myArray2[i+54+1];
      iterator++;
      pixelArray[iterator+stroka*1024]=myArray2[i+54];
      iterator++;
      pixelArray[iterator+stroka*1024]=255;
      iterator++;
      if(iterator==1024){iterator=0;stroka--;}
      }
    var imageData = new ImageData(pixelArray,256,256);
    var ctx2 = document.getElementById("canvas2").getContext("2d");
    ctx2.putImageData(imageData,0,0);
  });
}
let but = document.querySelector("button");
but.onclick = draw;