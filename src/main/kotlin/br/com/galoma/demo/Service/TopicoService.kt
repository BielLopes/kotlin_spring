package br.com.galoma.demo.service

import br.com.galoma.demo.dto.AtualizacaoTopicoForm
import br.com.galoma.demo.dto.TopicoDTOForm
import br.com.galoma.demo.dto.TopicoView
import br.com.galoma.demo.exception.NotFoundException
import br.com.galoma.demo.mapper.TopicoFormMapper
import br.com.galoma.demo.mapper.TopicoViewMapper
import br.com.galoma.demo.repository.TopicoRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoService(private val repository: TopicoRepository,
                    private val topicoViewMapper: TopicoViewMapper,
                    private val topicoFormMapper: TopicoFormMapper,
                    private val notFoundMessage: String = "Topico não Encontrado!"
) {

    fun listar(): List<TopicoView> {
        return repository.findAll().stream().map { t -> topicoViewMapper.map(t)}.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico =  repository.findById(id).orElseThrow{NotFoundException(notFoundMessage)}

        return topicoViewMapper.map(topico)
    }

    fun atualizar(form: AtualizacaoTopicoForm): TopicoView{
        val topico =  repository.findById(form.id).orElseThrow{NotFoundException(notFoundMessage)}

        topico.titulo = form.titulo
        topico.mensagem = form.mensagem
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(form: TopicoDTOForm): TopicoView{
        val topico = topicoFormMapper.map(form)
        repository.save(topico)

        return topicoViewMapper.map(topico)
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }

}