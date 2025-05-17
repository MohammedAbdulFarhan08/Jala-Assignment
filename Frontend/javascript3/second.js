const form = document.getElementById('myForm');
    const input = document.getElementById('myInput');
    const messageDiv = document.getElementById('message');

    form.addEventListener('submit', function(event) {
      event.preventDefault(); // prevent actual form submission
      // Clear previous message
      messageDiv.textContent = '';
      messageDiv.className = '';

      if (input.value.trim() === '') {
        messageDiv.textContent = 'Error: The text box cannot be empty.';
        messageDiv.classList.add('error');
        input.focus();
      } else {
        messageDiv.textContent = 'Form submitted successfully!';
        messageDiv.classList.add('success');
        // You can proceed with form submission here if needed
      }
    });