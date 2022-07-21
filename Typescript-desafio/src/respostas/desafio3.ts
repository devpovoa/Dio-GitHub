let botaoAtualizar = document.getElementById(
  "atualizar-saldo"
) as HTMLButtonElement;
let botaoLimpar = document.getElementById("limpar-saldo") as HTMLButtonElement;
let soma = document.getElementById("soma") as HTMLInputElement;
let campoSaldo = document.getElementById("campo-saldo") as HTMLSpanElement;

campoSaldo.innerHTML = "0";

function somarAoSaldo(soma: number) {
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
