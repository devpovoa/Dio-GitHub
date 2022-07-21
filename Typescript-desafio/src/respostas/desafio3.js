"use strict";
let botaoAtualizar = document.getElementById("atualizar-saldo");
let botaoLimpar = document.getElementById("limpar-saldo");
let soma = document.getElementById("soma");
let campoSaldo = document.getElementById("campo-saldo");
campoSaldo.innerHTML = "0";
function somarAoSaldo(soma) {
    campoSaldo.innerHTML = `${Number(campoSaldo.innerHTML) + soma}`;
}
function limparSaldo() {
    campoSaldo.innerHTML = "0";
    soma.value = "";
}
botaoAtualizar.addEventListener("click", () => {
    somarAoSaldo(Number(soma.value));
});
botaoLimpar.addEventListener("click", () => {
    limparSaldo();
});
