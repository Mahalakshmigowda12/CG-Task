package com.capgemini.Book_Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookNotFoundException extends RuntimeException {
 String message="Book not Found";
}
