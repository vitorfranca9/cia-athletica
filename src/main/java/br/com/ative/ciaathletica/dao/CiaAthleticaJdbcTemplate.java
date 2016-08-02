package br.com.ative.ciaathletica.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.ative.ciaathletica.entity.Teste;

@Component
public class CiaAthleticaJdbcTemplate {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public CiaAthleticaJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void select() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from teste");
		for (Map<String, Object> map : list) {
			Integer id = (Integer) map.get("idteste");
			String nome = (String) map.get("nome");
			Teste teste = new Teste();
			teste.setNome(nome);
			teste.setId(id);
			System.out.println(teste);
		}
	}

}
