package org.zerock.springexmine.service;

import org.zerock.springexmine.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);

    List<TodoDTO> getAll();
}
