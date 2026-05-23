 function mostrarDestinatario() {
            const select = document.getElementById('destinatario');
            const infoDiv = document.getElementById('info-dest');
            const valor = select.value;
            
            if (valor) {
                infoDiv.style.display = 'block';
                const texto = select.options[select.selectedIndex].text;
                infoDiv.textContent = 'Destinatário: ' + texto;
            } else {
                infoDiv.style.display = 'none';
            }
        }

        
