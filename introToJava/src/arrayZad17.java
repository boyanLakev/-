
public class arrayZad17 {

	/**
	 * 17. Напишете програма, която по подадена матрица намира най-голямата
област от еднакви числа. Под област разбираме съвкупност от съседни
(по ред и колона) елементи. Ето един пример, в който имаме област,
съставена от 13 на брой еднакви елементи със стойност 3:

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i, j, br, brMax;//
	        byte stMax;

	        byte[][] m =
	        {            
	        {1,3,2,2,2,4},       
	        {3,3,3,2,4,4},
	        {4,3,4,4,3,3},
	        {4,3,1,3,3,1},
	        {4,3,3,3,1,1}
	        };

	        byte[][] mProv = new byte[5][6]; 

	        for (i = 0; i < 5; i = i + 1)
	            for (j = 0; j < 6; j = j + 1)
	                mProv[i][ j] = 0;

	        brMax = 0;
	        stMax = m[0][ 0];

	        for (i = 0; i < 5; i = i + 1)
	        {
	            for (j = 0; j < 6; j = j + 1)
	            {
	                if (mProv[i][j] == 0)
	                {
	                    br = 0;
	                    mProv[i][ j] = 1;
	                    br = Prov(m, mProv, i, j, m[i][ j], br);

	                    if (br > brMax)
	                    {
	                        brMax = br;
	                        stMax = m[i][ j];
	                    }
	                }
	            }

	        }
	        //
	        System.out.printf("( {%d} ) --> {%d}",stMax, brMax);
	        System.out.println(" ");
	    }

	    static int Prov(byte[][] m, byte[][] mProv, int i, int j, byte st, int br)
	    {
	        int z;

	        br = br + 1;

	        z = i - 1;
	        if (z >= 0)
	        {
	            if ((m[z][ j] == st) && (mProv[z][ j] == 0))
	            {
	                mProv[z][ j] = 1;
	                br = Prov(m, mProv, z, j, st, br);
	            }
	        }

	        z = i + 1;
	        if (z < 5)
	        {
	            if ((m[z][ j] == st) && (mProv[z][ j] == 0))
	            {
	                mProv[z][ j] = 1;
	                br = Prov(m, mProv, z, j, st, br);
	            }
	        }

	        z = j - 1;
	        if (z >= 0)
	        {
	            if ((m[i][ z] == st) && (mProv[i][ z] == 0))
	            {
	                mProv[i][ z] = 1;
	                br = Prov(m, mProv, i, z, st, br);
	            }
	        }

	        z = j + 1;
	        if (z < 6)
	        {
	            if ((m[i][ z] == st) && (mProv[i][ z] == 0))
	            {
	                mProv[i][z] = 1;
	                br = Prov(m, mProv, i, z, st, br);
	            }
	        }
	        return br;
	    }
}
