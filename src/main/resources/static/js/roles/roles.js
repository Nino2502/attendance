document.addEventListener("DOMContentLoaded", function () {
    loadRoles();
});

function loadRoles() {

    axios.get("/api/roles")
        .then(function (response) {

            const data = response.data;

            // console.log("Datos recibidos:", JSON.stringify(data, null, 2));

            let rows = "";

            data.forEach(function (role) {

                if(role.createdAt){
                    const date = new Date(role.createdAt);

                    formattedDate = date.toLocaleString("es-MX", {
                        day: "2-digit",
                        month: "2-digit",
                        year: "numeric",
                        hour: "2-digit",
                        minute: "2-digit"
                    });


                }
                rows += `
                    <tr>
                        <td>${role.id}</td>
                        <td>${role.name}</td>
                        <td>${role.description ? role.description : ""}</td>
                        <td>${formattedDate}</td>
                    </tr>
                `;
            });

            document.getElementById("RolesTable").innerHTML = rows;
        })
        .catch(function (error) {
            console.error("Error cargando visitantes:", error);
        });

}
function OpenModal(){

    console.debug("Open Modal SAVE roles");

    $("#btn-save").text("Save Guardar");

    const modal = new bootstrap.Modal(document.getElementById("roleModal"));
    modal.show();
}


function saveRole(){
    console.debug("Voy aguadar role");

    const formData = new FormData();

    const nombre = $("#roleName").val();

    const description = $("#roleDescription").val();

    console.debug("Nombre . . " + nombre + "  Descripcion " + description);

    formData.append("name" , nombre);

    formData.append("description" ,description);

    console.debug("FORMDATA" , formData);


}