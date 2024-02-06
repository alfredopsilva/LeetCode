using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace FindTheDifference.obj
{
    public class Solution
    {
        public static char solution(string s, string t)
        {
            char missingChar = 'x';
            if (s.Length == 0)
            {
                return t[0];
            }
            else
            {
                for (var i = 0; i < t.Length; i++)
                {
                    for (var j = 0; j < s.Length; j++)
                    {
                        if (t[i] != s[j])
                        {
                            missingChar = t[i];
                        }
                    }
                }
                return missingChar;
            }
        }
    }
}