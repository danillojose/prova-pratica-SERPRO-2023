while(true){
    const number = prompt("Digite um número entre 0 e 100.", 20);
    if(number>=0 && number<=100){
        document.getElementById("fatorial").innerHTML = "O fatorial do número " + number + " é " + calculaFatorial(number);
        break;
    }
    else{
        window.alert("Erro. O número digitado deverá ser maior que 0 e menor que 100.")
    }
}

function calculaFatorial(numero){
    if(numero == 1){
        return numero;
    }
    return numero*calculaFatorial(numero-1);
}