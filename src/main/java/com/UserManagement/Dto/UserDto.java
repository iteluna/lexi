package com.UserManagement.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;

    @NotBlank(message = "Su nombre no puede estar en blanco")
    @Size(min = 2, max = 50, message = "Su nombre debe tener entre 2 a 50 caracteres")
    private String name;

    @NotEmpty(message = "Su correo electronico no puede estar vacio")
    @Email
    private String email;

    @NotNull(message = "Su contraseña no puede estar vacio")
    private String password;

    @Positive(message = "Su edad debe ser un numero positivo")
    @Max(value = 100, message = "Su edad debe ser maximo 100")
    private Integer age;

    @NotEmpty(message="Su celular no puede estar vacio")
    @Pattern(regexp = "\\d{8}", message = "Su celular debe ser de 8 digitos")
    private String phone;

    @NotEmpty(message="Su genero no puede estar vacio")
    @Pattern(regexp = "^(Male|Female)$", message = "Gender must be either 'Male' or 'Female'")
    private String gender;

    @NotBlank(message = "Su direccion no puede estar vacio")
    @Size(min = 5, max = 100, message = "Su direccion debe tener entre 5 a 100 caracteres")
    private String address;


    private String emailTeams;
    private String passwordTeams;
    private String hbDate;

    private String lastNamer;

    private String ci;

	  private String role;
}
