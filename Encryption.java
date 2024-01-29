package pkg;
//AlpNumAlp Class For Alpabate to Numaric ANd Num To Alp  

public class Encryption {

    public int AtoN(char pText) {
        int Index = 404;
        char AZ[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char az[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        for (int i = 0; i <= 25; i++) {
            if (pText == AZ[i] || pText == az[i])
                Index = i;
        }
        return Index;
    }

    public char NtoA(int Index) {
        char AZ[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        // char az[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        // 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        char ptext;
        ptext = AZ[Index];
        return ptext;
    }

    public int CaesarCipherEnc(int PlaneNumber, int key) {
        int EnX = (PlaneNumber + key) % 26;
        return EnX;
    }

    public int CaesarCipherDcp(int PlaneNumber, int key) {
        int EnX = (PlaneNumber - key) % 26;
        return EnX;
    }

    public String ccEnc(String PlaneText, int key) {
        char demo;
        String EncText = "";
        for (int i = 0; i <= PlaneText.length() - 1; i++) {
            demo = this.NtoA(this.CaesarCipherEnc(this.AtoN(PlaneText.charAt(i)), key));
            EncText = EncText + demo;
        }
        return EncText;
    }

    public String ccDcp(String PlaneText, int key) {
        char demo;
        String EncText = "";
        for (int i = 0; i <= PlaneText.length() - 1; i++) {
            demo = this.NtoA(this.CaesarCipherDcp(this.AtoN(PlaneText.charAt(i)), key));
            EncText = EncText + demo;
        }
        return EncText;
    }
}
