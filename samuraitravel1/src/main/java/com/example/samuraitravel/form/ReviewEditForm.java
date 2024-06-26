package com.example.samuraitravel.form;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewEditForm {
	@NotNull
	private Integer id;

	@Range(min = 1, max = 5, message = "評価は1～5の中から選択してください")
	private Integer score;

	@NotNull(message = "コメントをしてください")
	@Size(min = 10, max = 300, message = "コメントは10文字以上300文字以内で入力してください。")
	private String content;

}
