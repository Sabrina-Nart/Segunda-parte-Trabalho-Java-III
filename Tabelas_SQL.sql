
CREATE TABLE cliente (
	id SERIAL NOT NULL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
  	cpf CHAR(11) NOT NULL,
  	telefone VARCHAR(11) NOT NULL,
  	endereco VARCHAR(100) NOT NULL,
  	sexo CHAR(1) NOT NULL	
);

-------------------------------

CREATE TABLE funcionario (
	id SERIAL NOT NULL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
  	cpf CHAR(11) NOT NULL,
  	telefone VARCHAR(11) NOT NULL,
  	endereco VARCHAR(100) NOT NULL,	
	data_contratacao DATE NOT  NULL,
	funcao VARCHAR(50) NOT NULL
);

----------------------------------

CREATE TABLE cidade (
	id SERIAL NOT NULL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	estado char(2) not null
);

----------------------------------

CREATE TABLE acessorio (
	id SERIAL NOT NULL PRIMARY KEY,
	nome VARCHAR(30) NOT NULL,	
	descricao VARCHAR(110)
);

----------------------------------

CREATE TABLE vestido (
	id SERIAL NOT NULL PRIMARY KEY,
	cor CHAR(1) NOT NULL,
	tamanho CHAR(1) NOT NULL,
	categoria CHAR(2) NOT NULL,
	descricao VARCHAR(110)
);

-----------------------------------

CREATE TABLE locacao(
	id SERIAL NOT NULL PRIMARY KEY,
	id_cliente INTEGER NOT NULL,
	id_funcionario INTEGER NOT NULL,
	total_vestido NUMERIC(10,2) NOT NULL,
	total_acessorios NUMERIC(10,2) NOT NULL,
	evento VARCHAR(30) NOT NULL,
	data_retirada DATE NOT NULL,
	data_entrega DATE NOT NULL,
	CONSTRAINT fk_locacao_cliente FOREIGN KEY(id_cliente) REFERENCES cliente(id),
	CONSTRAINT fk_locacao_funcionario FOREIGN KEY(id_funcionario) REFERENCES funcionario(id)
);

/////////////////

Um tem relação no outro é obrigado a ter relação

select tb_reserva_traje.*, tb_cliente.id_cliente, tb_cliente.nome, tb_vestidos.descricao
from tb_reserva_traje
inner join tb_cliente on (tb_cliente.id_cliente = tb_reserva_traje.id_cliente)
inner join tb_vestidos on (tb_vestidos.id_vestido = tb_reserva_traje.id_vestido)

order by tb_reserva_traje.id_cliente