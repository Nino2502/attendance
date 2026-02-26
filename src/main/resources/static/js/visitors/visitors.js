document.addEventListener("DOMContentLoaded", function () {
    loadVisitors();

});

function loadVisitors() {

    axios.get("/api/visitors")
        .then(function (response) {

            const data = response.data;

            console.log("Datos recibidos:", data);

            let rows = "";

            data.forEach(function (visitor) {
                rows += `
                    <tr>
                        <td>${visitor.id}</td>
                        <td>${visitor.fullName}</td>
                        <td>${visitor.company ? visitor.company : ""}</td>
                        <td>${visitor.checkIn ? visitor.checkIn : ""}</td>
                    </tr>
                `;
            });

            document.getElementById("visitorTable").innerHTML = rows;
        })
        .catch(function (error) {
            console.error("Error cargando visitantes:", error);
        });

}