package ar.edu.unsam.saluditto.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
class SaludittoController {

    @GetMapping("/saludoDefault")
    fun saludoDefault() = "Hola, campeón!"

    @GetMapping("/saludoCustom/{persona}")
    fun saludoCustom(@PathVariable persona: String) = "Hola, $persona!"


}