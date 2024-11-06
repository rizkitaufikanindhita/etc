const token = ~~[Math.random() * 12345678];

const pictures = ["1.jpg", "2.jpg", "3.jpg"];

function login(username) {
  console.log("login...");
  return new Promise((success, failed) => {
    setTimeout(() => {
      if (username != "rizki") failed("username not found");
      else success({ token });
    }, 200);
  });
}

function getUser(token) {
  console.log("get user...");
  return new Promise((success, failed) => {
    if (!token) failed("token not found");
    setTimeout(() => {
      success({ apiKey: "xKey123" });
    }, 200);
  });
}

function getPictures(apiKey) {
  console.log("get pictures...");
  return new Promise((success, failed) => {
    if (!apiKey) failed("apiKey not found");
    setTimeout(() => {
      success({ pictures });
    }, 200);
  });
}

async function userDisplay() {
  try {
    const { token } = await login("rizki");
    const { apiKey } = await getUser(token);
    const { pictures } = await getPictures(apiKey);

    console.log(`
      token anda adalah ${token} 
      apikey anda adalah ${apiKey}
      hasil request gambar anda berikut ini: ${pictures}`);
  } catch (err) {
    console.log(err);
  }
}

userDisplay();
