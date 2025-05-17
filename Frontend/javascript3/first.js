document.getElementById('showDateTimeBtn').addEventListener('click', function () {
      const now = new Date();
      document.getElementById('datetime').textContent = now.toString();
    });