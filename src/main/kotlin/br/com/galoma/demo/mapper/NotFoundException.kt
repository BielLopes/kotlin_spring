package br.com.galoma.demo.exception

import java.lang.RuntimeException

class NotFoundException(message: String?): RuntimeException(message) {

}