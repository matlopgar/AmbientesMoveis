package br.com.cotemig.trabalhofinal.models

data class Escola(
    var NOM_OFIC_ESCL: String ="",
    var NUM_DDD1: String="",
    var NUM_TEL1: String="",
    var NUM_COMPLETO: String = NUM_DDD1 + "" + NUM_TEL1,
    var E_MAIL : String ="",
    var NOM_BAIR : String="",
    var NOM_MUNC : String ="",
    var  TIP_LOGR: String="",
    var NOM_LOGR: String="",
    var END_COMPLETO: String= TIP_LOGR + "" + NOM_LOGR
)

