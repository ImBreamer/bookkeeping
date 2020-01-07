package com.book.keeping.bookkeeping.service.impl;

import com.book.keeping.bookkeeping.entity.BookUserTag;
import com.book.keeping.bookkeeping.entity.reflect.BookUserTagDTO;
import com.book.keeping.bookkeeping.mapper.BookUserTagMapper;
import com.book.keeping.bookkeeping.service.TagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @author zhang.penghao
 * @version V1.0
 * @date 2020/1/7
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TagServiceImpl implements TagService {

    private final BookUserTagMapper tagMapper;

    @Override
    public int deleteUserTag(int id, String userId) {
        return tagMapper.deleteUserTag(id, userId);
    }

    @Override
    public List<BookUserTagDTO> listUserTag(String userId) {
        return tagMapper.listUserTag(userId);
    }

    @Override
    public int insertTag(BookUserTag tag) {
        return tagMapper.insert(tag);
    }
}
