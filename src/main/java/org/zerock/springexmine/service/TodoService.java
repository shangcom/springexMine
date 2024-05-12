package org.zerock.springexmine.service;

import org.zerock.springexmine.dto.PageRequestDTO;
import org.zerock.springexmine.dto.PageResponseDTO;
import org.zerock.springexmine.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}
