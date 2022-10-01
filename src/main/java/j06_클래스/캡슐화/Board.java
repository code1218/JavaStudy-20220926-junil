package j06_클래스.캡슐화;

import java.time.LocalDateTime;

public class Board {
	private int boardCode;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime createDate;
	private int count;
	
	public Board() {
		
	}

	public Board(int boardCode, String title, String writer, String content, LocalDateTime createDate, int count) {
		this.boardCode = boardCode;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.createDate = createDate;
		this.count = count;
	}
	
	public int getBoardCode() {
		return boardCode;
	}
	
	public void setBoardCode(int boardCode) {
		this.boardCode = boardCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Board [boardCode=" + boardCode + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", createDate=" + createDate + ", count=" + count + "]";
	}
	
	
	
}









