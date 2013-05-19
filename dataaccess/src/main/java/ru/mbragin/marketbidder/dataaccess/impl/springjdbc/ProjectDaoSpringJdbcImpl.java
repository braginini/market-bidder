package ru.mbragin.marketbidder.dataaccess.impl.springjdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import ru.mbragin.marketbidder.dataaccess.ProjectDao;
import ru.mbragin.marketbidder.dataaccess.impl.springjdbc.mapper.ProjectRowMapper;
import ru.mbragin.marketbidder.model.Project;

import java.io.IOException;
import java.util.List;

/**
 * @author: Mikhail Bragin
 */
@Repository
public class ProjectDaoSpringJdbcImpl extends AbstractSpringJdbc implements ProjectDao {

    private static final String TABLE_NAME = "projects";

    @Override
    public List<Project> getAllAccountProjects(long accountId) throws IOException {
        try {
            return getNamedJdbcTemplate().query("SELECT * FROM " + SCHEMA_NAME + TABLE_NAME +
                    " WHERE account_id = :account_id", new MapSqlParameterSource("account_id", accountId),
                    new ProjectRowMapper());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int getAccountProjectsCount(long accountId) throws IOException {
        try {
            return getNamedJdbcTemplate().queryForInt("SELECT COUNT(*) FROM " + SCHEMA_NAME + TABLE_NAME +
                    " WHERE account_id = :account_id", new MapSqlParameterSource("account_id", accountId));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public long createProject(Project project) throws IOException {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        getNamedJdbcTemplate().update("INSERT INTO " + TABLE_NAME + " (account_id, description, title, url, " +
                "yandex_login, is_default )" +
                "VALUES (:account_id, " +
                ":description," +
                ":title," +
                ":url," +
                ":yandex_login," +
                ":is_default)",
                new MapSqlParameterSource()
                        .addValue("account_id", project.getAccountId())
                        .addValue("description", project.getDescription())
                        .addValue("title", project.getTitle())
                        .addValue("url", project.getUrl())
                        .addValue("yandex_login", project.getYandexLogin())
                        .addValue("is_default", project.isDefaultProject()),
                keyHolder);
        project.setId(keyHolder.getKey().longValue());
        return project.getId();
    }

    @Override
    public void updateProject(Project project) throws IOException {
        getNamedJdbcTemplate().update("UPDATE " + SCHEMA_NAME + TABLE_NAME + " SET " +
                "account_id = :account_id, " +
                "description = :description, " +
                "title = :title, " +
                "url = :url, " +
                "yandex_login = :yandex_login, " +
                "is_default = :is_default, " +
                "yandex_token = :yandex_token " +
                "WHERE id = :id",
                new MapSqlParameterSource()
                        .addValue("id", project.getId())
                        .addValue("account_id", project.getAccountId())
                        .addValue("description", project.getDescription())
                        .addValue("title", project.getTitle())
                        .addValue("url", project.getUrl())
                        .addValue("yandex_login", project.getYandexLogin())
                        .addValue("yandex_token", project.getYandexToken())
                        .addValue("is_default", project.isDefaultProject()));
    }

    @Override
    public Project getProjectById(Long projectId) throws IOException {
        try {
            return getNamedJdbcTemplate().queryForObject("SELECT * FROM " + SCHEMA_NAME + TABLE_NAME +
                    " WHERE id = :id", new MapSqlParameterSource("id", projectId),
                    new ProjectRowMapper());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteProject(long id) throws IOException {
        getNamedJdbcTemplate().update("DELETE FROM " + SCHEMA_NAME + TABLE_NAME + "WHERE id = :id",
                new MapSqlParameterSource("id", id));
    }

    @Override
    public List<Project> getAccountProjects(long accountId, long start, Long limit) throws IOException {
        try {
            return getNamedJdbcTemplate().query("SELECT * FROM ( SELECT *, ROW_NUMBER() OVER (ORDER BY date_created) as row FROM " + SCHEMA_NAME + TABLE_NAME +
                    " WHERE account_id = :account_id ) a WHERE row > :start and row <= :limit ", new MapSqlParameterSource()
                    .addValue("account_id", accountId)
                    .addValue("start", start)
                    .addValue("limit", limit),
                    new ProjectRowMapper());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
