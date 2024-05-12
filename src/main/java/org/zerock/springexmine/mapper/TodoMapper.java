package org.zerock.springexmine.mapper;

import org.zerock.springexmine.domain.TodoVO;

import java.util.List;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();
}
