package com.jie.java_base.exception;

public class CustomizeExceptionExample {
    public static void main(String[] args) {

    }

    public class BaseException extends RuntimeException {
        public BaseException() {
            super();
        }

        public BaseException(String message) {
            super(message);
        }

        public BaseException(String message, Throwable cause) {
            super(message, cause);
        }

        public BaseException(Throwable cause) {
            super(cause);
        }

        public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

    public class UserNotFindException extends BaseException {
    }

    public class LoginFailedException extends BaseException {
    }
}
