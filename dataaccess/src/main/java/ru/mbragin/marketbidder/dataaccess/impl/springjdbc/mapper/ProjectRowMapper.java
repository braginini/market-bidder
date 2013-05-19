package ru.mbragin.marketbidder.dataaccess.impl.springjdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.mbragin.marketbidder.model.Campaign;
import ru.mbragin.marketbidder.model.Project;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: Mikhail Bragin
 */
public class ProjectRowMapper implements RowMapper<Project> {
    @Override
    public Project mapRow(ResultSet resultSet, int i) throws SQLException {
        Project project = new Project();

        project.setId(resultSet.getLong("id"));
        project.setAccountId(resultSet.getLong("account_id"));
        project.setTitle(resultSet.getString("title"));
        project.setDescription(resultSet.getString("description"));
        project.setUrl(resultSet.getString("url"));
        project.setYandexLogin(resultSet.getString("yandex_login"));
        project.setYandexToken(resultSet.getString("yandex_token"));

        return project;
    }
}
