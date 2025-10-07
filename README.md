<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <title>Arga Chandra Wirawan — Portfolio</title>
  <meta name="description" content="Portfolio Arga Chandra Wirawan — Kaiju No.8 themed interactive GitHub profile page" />

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600;700&family=Noto+Sans+JP:wght@400;700&display=swap" rel="stylesheet">

  <style>
    :root{
      --bg-dark:#050505;
      --bg-panel:#0a0a0a;
      --accent-red:#ff2a2a;
      --accent-cyan:#00e5ff;
      --text-light:#e5e5e5;
      --text-dim:#aaaaaa;
      --card-bg:rgba(255,255,255,0.03);
      --border:1px solid rgba(255,255,255,0.08);
      --shadow:0 8px 24px rgba(0,0,0,0.6);
      --font-title:'Orbitron', sans-serif;
      --font-body:'Noto Sans JP', sans-serif;
    }
    *{box-sizing:border-box; margin:0; padding:0}
    body{
      font-family:var(--font-body);
      background:radial-gradient(circle at 20% 20%, rgba(255,42,42,0.06), transparent), radial-gradient(circle at 80% 80%, rgba(0,229,255,0.05), transparent), var(--bg-dark);
      color:var(--text-light);
      overflow-x:hidden;
    }
    header{
      padding:24px 40px;
      display:flex;align-items:center;justify-content:space-between;
      border-bottom:var(--border);
      background:rgba(0,0,0,0.4);
      backdrop-filter:blur(6px);
      position:sticky;top:0;z-index:10;
    }
    .logo{
      display:flex;align-items:center;gap:16px;
      font-family:var(--font-title);
      cursor:pointer;
    }
    .logo-icon{
      width:60px;height:60px;
      border-radius:12px;
      background:linear-gradient(135deg,var(--accent-red),var(--accent-cyan));
      display:grid;place-items:center;
      font-weight:700;font-size:18px;color:#000;
      box-shadow:0 0 20px rgba(255,42,42,0.4);
    }
    nav button{
      background:none;border:var(--border);
      color:var(--accent-cyan);
      font-family:var(--font-title);
      padding:8px 14px;border-radius:8px;
      cursor:pointer;transition:0.2s;
    }
    nav button:hover{
      background:rgba(0,229,255,0.1);
      transform:translateY(-2px);
    }

    main{max-width:1100px;margin:40px auto;padding:0 20px;display:grid;gap:24px;}

    .profile-card{
      background:var(--card-bg);
      border:var(--border);
      border-left:4px solid var(--accent-red);
      border-radius:16px;
      padding:28px;
      box-shadow:var(--shadow);
    }
    .profile-header{
      display:flex;align-items:center;gap:24px;
    }
    .avatar{
      width:120px;height:120px;border-radius:16px;
      background:linear-gradient(135deg,var(--accent-red),var(--accent-cyan));
      display:grid;place-items:center;font-family:var(--font-title);
      font-size:26px;font-weight:700;color:#000;
      box-shadow:0 0 40px rgba(255,42,42,0.4);
    }
    h1{font-family:var(--font-title);font-size:28px;color:var(--accent-cyan);}
    .info{margin-top:12px;display:grid;grid-template-columns:repeat(auto-fit,minmax(220px,1fr));gap:10px;}
    .info div{background:rgba(255,255,255,0.02);padding:8px 10px;border-radius:8px;font-size:14px;}

    .summary{margin-top:16px;font-size:15px;color:var(--text-dim);}

    .skills,.projects{
      background:var(--card-bg);
      border:var(--border);
      border-radius:16px;
      padding:24px;
      box-shadow:var(--shadow);
    }
    h2{font-family:var(--font-title);color:var(--accent-red);margin-bottom:12px;}

    .lang-list{display:flex;flex-wrap:wrap;gap:10px;}
    .lang{padding:8px 12px;border-radius:20px;border:1px solid rgba(255,255,255,0.08);background:rgba(255,255,255,0.03);font-size:14px;color:var(--accent-cyan);}

    footer{text-align:center;color:var(--text-dim);padding:30px 20px;font-size:13px;}
  </style>
</head>
<body>
  <header>
    <div class="logo" onclick="window.scrollTo({top:0,behavior:'smooth'})">
      <div class="logo-icon">Wann</div>
      <div>
        <div>Arga Chandra Wirawan</div>
        <div style="font-size:12px;color:var(--text-dim)">Kaiju No.8 Themed Portfolio</div>
      </div>
    </div>
    <nav>
      <button onclick="scrollToSection('skills')">Skills</button>
      <button onclick="scrollToSection('projects')">Projects</button>
      <button onclick="copyEmail()">Email</button>
    </nav>
  </header>

  <main>
    <section class="profile-card">
      <div class="profile-header">
        <div class="avatar">ACW</div>
        <div>
          <h1>Arga Chandra Wirawan</h1>
          <div class="info">
            <div><strong>NIM:</strong> 254107020023</div>
            <div><strong>Kelas:</strong> 1C</div>
            <div><strong>No Absen:</strong> 04</div>
            <div><strong>Email:</strong> <span id="email">argawawan355@gmail.com</span></div>
          </div>
        </div>
      </div>
      <p class="summary">Halo! Saya seorang mahasiswa yang sedang belajar dan mengembangkan kemampuan dalam pemrograman, dengan minat besar pada dunia teknologi dan software development. Saat ini saya belum memiliki project yang dipublikasikan, namun saya aktif berlatih dan belajar membuat aplikasi serta website dengan beberapa bahasa pemrograman.</p>
    </section>

    <section id="skills" class="skills">
      <h2>Kemampuan & Bahasa Pemrograman</h2>
      <div class="lang-list">
        <div class="lang">Java</div>
        <div class="lang">HTML</div>
        <div class="lang">CSS</div>
        <div class="lang">JavaScript</div>
      </div>
    </section>

    <section id="projects" class="projects">
      <h2>Project</h2>
      <p style="color:var(--text-dim);">Saya belum memiliki project yang dipublikasikan saat ini, namun saya sedang dalam proses mempelajari dan mengembangkan beberapa project latihan kecil untuk memperkuat kemampuan saya di bidang pengembangan aplikasi dan web.</p>
    </section>
  </main>

  <footer>
    © 2025 Arga Chandra Wirawan — Kaiju No.8 Themed Portfolio for GitHub Pages
  </footer>

  <script>
    function scrollToSection(id){
      const el=document.getElementById(id);
      if(el) el.scrollIntoView({behavior:'smooth'});
    }
    function copyEmail(){
      const email=document.getElementById('email').innerText;
      navigator.clipboard.writeText(email).then(()=>{
        alert('Email disalin ke clipboard: '+email);
      });
    }
  </script>
</body>
</html>
