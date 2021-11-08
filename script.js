"use strict";

function file_get_contents(url) {

    let request = null;
    try {
        request = new ActiveXObject("Msxml2.XMLHTTP");
    } catch (e) {
        try {
            request = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (e) {
            try { request = new XMLHttpRequest(); }
            catch (e) {
                //  pass
            }
        }
    }

    if (request == null) throw new Error('XMLHttpRequest not supported');

    request.open("GET", url, false);
    request.send(null);

    return request.responseText;
}

function $_GET(param) {
    var vars = {};
    window.location.href.replace(location.hash, '').replace(
        /[?&]+([^=&]+)=?([^&]*)?/gi,
        function (m, key, value) {
            vars[key] = value !== undefined ? value : '';
        }
    );

    if (param) {
        return vars[param] ? vars[param] : null;
    }
    return vars;
}

let box = $_GET('box');

document.write("<center>");


if (box) {
    document.write("<h1>Содержимое коробки №" + box + "</h1>");
} else {
    document.write("<h1>Выберите коробку</h1>");
}

let string = file_get_contents("https://docs.google.com/spreadsheets/d/1QZ1Wng2Knh9DWmFRf4svurDsbh6b8jCnEA3EDyZggqQ/gviz/tq?tqx=out:json&tq&gid=0");

let jsonData = string.match(/setResponse\((.*?)\);/i)[1];
// document.write(typeof (JSON.parse(jsonData)));
let data = JSON.parse(jsonData);

let counter = 0;

for (let value in data["table"]["rows"]) {
    if (value == 0 ||
        data["table"]["rows"][value]["c"][0]["v"] != box) {
        continue;
    } else {
        // <b> ${data["table"]["rows"][0]["c"][0]["v"]} </b>: 
        // ${data["table"]["rows"][value]["c"][0]["v"]} <br>
        counter++;
        document.write(`
            <b>${counter}) ${data["table"]["rows"][0]["c"][1]["v"]} </b>:
            ${data["table"]["rows"][value]["c"][1]["v"]} <br>
            <b> ${data["table"]["rows"][0]["c"][2]["v"]} </b>:
            ${data["table"]["rows"][value]["c"][2]["v"]} <br>
            <b> ${data["table"]["rows"][0]["c"][3]["v"]} </b>:
            ${data["table"]["rows"][value]["c"][3]["v"]} <br>
            ---------------------------------------------------------<br>
        `);
    }

}

document.write("<h2>Доступные коробки:</h2>");
counter = 0;
let boxes = [];

for (let value in data["table"]["rows"]) {
    let linkValue = data["table"]["rows"][value]["c"][0]["v"];
    boxes.push(linkValue);
}

let uniqueBoxes = [...new Set(boxes)];

for (let value in uniqueBoxes) {
    if (value == 0) { continue; }
    counter++;
    // document.write(`<a href=\"/apitest2/?box=${uniqueBoxes[value]}\">Коробка №${uniqueBoxes[value]}</a>&nbsp&nbsp`);
    document.write(`<a href=\"/public/?box=${uniqueBoxes[value]}\">Коробка №${uniqueBoxes[value]}</a>&nbsp&nbsp`);
    if (counter == 3) { document.write("<br>"); counter = 0; }
}

document.write("</center>");
