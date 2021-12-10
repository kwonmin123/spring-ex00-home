package org.zerock.domain.project01;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class BoardVO {

	private Integer id;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime inserted;
	private LocalDateTime updated;
}
