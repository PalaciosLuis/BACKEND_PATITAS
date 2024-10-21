package pe.edu.cibertec.patitas_backend.dto;

public record LoginRequestDTO(String tipoDocumento, String numeroDocumento, String password) {
}