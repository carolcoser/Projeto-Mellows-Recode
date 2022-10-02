package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.Login;

public class Usuario {

	private int idUsuario;
	private String nome;
	private LocalDate dataNascimento;
	private String senha;
	private String email;
	private Login login;

	// Formata data
	DateTimeFormatter formata = DateTimeFormatter.ofPattern("d/MM/yyyy");

	public int getIdUsuario() {
		return idUsuario;

	}

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String nome, String dataNascimento, String senha, String email, Login login) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.dataNascimento = LocalDate.parse(dataNascimento, formata);
		this.senha = senha;
		this.email = email;
		this.login = login;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return formata.format(dataNascimento);
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento, formata);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
}
