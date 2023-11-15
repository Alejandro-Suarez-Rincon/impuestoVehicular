import lombok.Data;
@Data
@AllArgsConstructor
public class CreateVehicleResDTO(
    Private String mensaje;  
    Private String placa;
    Private String tipo_de_sevicio;
    Private String clase;
    Private String marca_comercial;
    Private String linea;
    Private String tonelaje;
    Private String pasajeros;
    Private String carroceria;
    Private String capacidad_de_cilindraje;
    Private String valor_de_IVA;
    Private String modelo;
    Private boolean importado;
    Private boolean blindado;
    Private boolean caja_automatica;
    Private boolean cartas_abiertas;
    Private boolean rodado;
    Private boolean chatarrizado;
    Private boolean Confiscado;
    Private boolean Accidentado;
    Private String estado;
    Private String dominio_de_extencion;
    Private String tipo_de_vehiculo;
    Private String antiguo;
)