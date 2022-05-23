const getDatos = async () => {
    let request = await fetch("/api/v1/devices");
    if (request.status === 200) {
        const data = await request.json();
        console.log(data);
        const tableHtml = crearTabla(data);
        document.getElementById("tabla").innerHTML = tableHtml;

        addListeners();
    }
};



const updateDispositivo = async () => {
    let request = await fetch("/api/v1/devices/update");
    if (request.status === 200) {
        const data = await request.json();
        document.location.reload();
    }
};


const insertDispositivo = async () => {
    let request = await fetch("/api/v1/devices/insert");
    if (request.status === 200) {
        const data = await request.json();
        document.location.reload();
    }
};



document.getElementById('update').addEventListener("click", function() {
    updateDispositivo();
});
document.getElementById('insert').addEventListener("click", function() {
    insertDispositivo();
});

getDatos();