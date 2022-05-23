function crearBoton(id){

    return `<button class='boton' id='${id}'>Borrar Dispositivo</button>`;

    // return element;
}

const removeDispositivo = async (id) => {
    let request = await fetch(`/api/v1/devices/remove/${id}`);
    if (request.status === 200) {
        const data = await request.json();
        console.log(data);
        window.location.reload();
    }
};

function addListeners(){
    const botones = [... document.querySelectorAll('.boton')];

    for (const boton of botones) {
        boton.addEventListener("click", function() {
            //document.getElementById("demo").innerHTML = "Hello World";
            removeDispositivo(this.id);
        });
    }

}

function crearTabla(jsonData){
    if (!jsonData.length){
        return;
    }
    const jsonEl = jsonData[0];

    var tableHTML = "<tr>";
    for (var header of Object.keys(jsonEl)){
        tableHTML += "<th>" + header + "</th>";
    }
    tableHTML += "<th>Borrar</th>";
    tableHTML += "</tr>";

    for (var eachItem in jsonData) {
        tableHTML += "<tr>";
        var dataObj = jsonData[eachItem];
        for (var eachValue in dataObj){
            tableHTML += "<td>" + dataObj[eachValue] + "</td>";
        }

        tableHTML += "<td>" + crearBoton(dataObj["dispositivo_ID"]) + "</td>";

        tableHTML += "</tr>";
    }

    return tableHTML;
}