package br.com.galoma.demo.mapper

import br.com.galoma.demo.dto.TopicoDTOForm
import br.com.galoma.demo.model.Topico
import br.com.galoma.demo.service.CursoService
import br.com.galoma.demo.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(private val cursoService: CursoService, private val usuarioService: UsuarioService): Mapper<TopicoDTOForm, Topico> {

    override fun map(t: TopicoDTOForm): Topico {
       return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}