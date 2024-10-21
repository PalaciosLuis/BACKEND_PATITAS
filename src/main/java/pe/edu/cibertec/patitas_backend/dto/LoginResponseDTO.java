package pe.edu.cibertec.patitas_backend.dto;

public record LoginResponseDTO(String codigo, String mensaje, String nombreUsuario, String correoUsuario, String tdoc, String ndoc) {
}
