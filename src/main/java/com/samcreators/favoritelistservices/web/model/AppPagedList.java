package com.samcreators.favoritelistservices.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class AppPagedList extends PageImpl<AppDto> {
    public AppPagedList(List<AppDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public AppPagedList(List<AppDto> content) {
        super(content);
    }
}
