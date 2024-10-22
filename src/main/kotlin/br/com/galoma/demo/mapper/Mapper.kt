package br.com.galoma.demo.mapper

interface Mapper<T, U> {
    fun map(t: T) :U

}