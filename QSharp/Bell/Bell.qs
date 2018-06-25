namespace Quantam.Bell
{
    open Microsoft.Quantum.Canon;
    open Microsoft.Quantum.Primitive;

    operation Set (desired: Result,q1: Qubit) : ()
    {
        body
        {
            let current = M(q1);

            if(desired != current)
            {
                X(q1);
            }
        }
    }

    operation BellTest (count : Int, initial: Result) : (Int,Int)
    {
        body
        {
            mutable numOnes = 0;
            using (qubits = Qubit[1])
            {
                for(test in 1..count)
                {
                    Set (initial,qubits[0]);

                    let res = M (qubits[0]);

                    //Count the number of ones we saw:
                    if(res == One)
                    {
                        set numOnes = numOnes + 1;
                    }
                }
                Set(Zero, qubits[0]);
            }
            // Return number of times we saw a |0> and number of times we saw a |1>
            return (count-numOnes, numOnes);
        }
    }
}
