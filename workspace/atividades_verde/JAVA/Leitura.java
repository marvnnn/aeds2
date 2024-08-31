import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Leitura {
    public static boolean strComp(String x, String y) {
        boolean resposta = false;
        int tam1 = x.length(), tam2 = y.length();
        if(tam1 == tam2) {
            resposta = true;
            for(int i = 0; i < tam1; i++) {
                char c1 = x.charAt(i), c2 = y.charAt(i);
                if(c1 != c2) {
                    resposta = false;
                    i = tam1;
                }
            }
        }
        return resposta;
    }
	public static String getHtml(String endereco){
		StringBuffer resp = new StringBuffer();
		try {
			URL obj = new URL(endereco);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// Método de requisição
			con.setRequestMethod("GET");

			// Código de resposta da conexão
			int responseCode = con.getResponseCode();

			// Se a conexão foi bem-sucedida (código 200)
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;

				while ((inputLine = in.readLine()) != null) {
					resp.append(inputLine);
				}

				// Fecha os buffers
				in.close();

			} else {
				System.out.println("Erro na conexão: " + responseCode);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}      

		return resp.toString();
	}
	public static void main(String[] args) {
		String endereco, html, nome;
        Scanner reader = new Scanner(System.in);
        nome = reader.nextLine();
        while(!strComp(nome, "FIM")) {
            int[] contagem = new int[25];
            endereco = reader.nextLine();
            html = getHtml(endereco);
            for(int i = 0; i < html.length() - 4; i++) {
                char c = html.charAt(i);
                char c2 = html.charAt(i+1);
                char c3 = html.charAt(i+2);
                char c4 = html.charAt(i+3);
                if(c == 'a')
                    contagem[0] += 1;
                else if(c == 'e')
                    contagem[1] += 1;
                else if(c == 'i')
                    contagem[2] += 1;
                else if(c == 'o')
                    contagem[3] += 1;
                else if(c == 'u')
                    contagem[4] += 1;
                else if(c == 225)
                    contagem[5] += 1;
                else if(c == 233)
                    contagem[6] += 1;
                else if(c == 237)
                    contagem[7] += 1;
                else if(c == 243)
                    contagem[8] += 1;
                else if(c == 250)
                    contagem[9] += 1;
                else if(c == 224)
                    contagem[10] += 1;
                else if(c == 232)
                    contagem[11] += 1;
                else if(c == 236)
                    contagem[12] += 1;
                else if(c == 242)
                    contagem[13] += 1;
                else if(c == 249)
                    contagem[14] += 1;
                else if(c == 227)
                    contagem[15] += 1;
                else if(c == 245)
                    contagem[16] += 1;
                else if(c == 226)
                    contagem[17] += 1;
                else if(c == 234)
                    contagem[18] += 1;
                else if(c == 238)
                    contagem[19] += 1;
                else if(c == 244)
                    contagem[20] += 1;
                else if(c == 251)
                    contagem[21] += 1;
                else if((c >= 'a' && c <= 'z') && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                    contagem[22] += 1;
                else if(c == '\\' && c2 == '<' && c3 == 'b' && c4 == 'r')
                    contagem[23] += 1;
                else if(c == '$' && c2 == '<' && c3 == 't' && c4 == 'a')
                    contagem[24] += 1;
            }
                System.out.printf(      
        "a(%d) e(%d) i(%d) o(%d) u(%d) \u00e1(%d) \u00e9(%d) \u00ed(%d) \u00f3(%d) \u00fa(%d) \u00e0(%d) \u00e8(%d) \u00ec(%d) \u00f2(%d) \u00f9(%d) \u00e3(%d) \u00f5(%d) \u00e2(%d) \u00ea(%d) \u00ee(%d) \u00f4(%d) \u00fb(%d) consoante(%d) <br>(%d) <table>(%d) %s\n",
                contagem[0] - 1, contagem[1] - 1, contagem[2], contagem[3], contagem[4], contagem[5], contagem[6], contagem[7], contagem[8], contagem[9],
                contagem[10], contagem[11], contagem[12], contagem[13], contagem[14], contagem[15], contagem[16], contagem[17], contagem[18],
                contagem[19], contagem[20], contagem[21], contagem[22], contagem[23], contagem[24], nome);
            nome = reader.nextLine();
        }
        reader.close();
	}
    
}
