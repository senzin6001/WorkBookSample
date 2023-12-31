package com.example.demo.login.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.login.domain.model.Question;

public interface QuestionDao {
	public int count() throws DataAccessException;
	public int insertOne(Question question) throws DataAccessException;
	public Question selectOne(Integer questionId) throws DataAccessException;	
	public List<Question> selectMany() throws DataAccessException;
	public int updateOne(Question question) throws DataAccessException;
	public int deleteOne(Integer questionId) throws DataAccessException;
	public void questionCsvOut() throws DataAccessException;
	public List<String> groupByCategory() throws DataAccessException;
	public void initQuestionTable() throws DataAccessException;
	public void insertQuestionList(List<Question> questionList) throws DataAccessException;
	public List<Question> filterUnansweredQuestions() throws DataAccessException;
	public int myQuestionCount() throws DataAccessException;
	public void saveResult(int questionId,boolean result) throws DataAccessException;
	public void saveAnswered(int questionId) throws DataAccessException;
    public int countCorrectAnswer() throws DataAccessException;
}