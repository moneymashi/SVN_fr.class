'''
Created on 2017. 7. 27.

@author: kitcoop
'''
from pandas import Series, DataFrame
import numpy as np
import pandas as pd
no = np.arange(1,11,1)
team = ["KIA","NC","두산","넥센","LG","SK","롯데","삼성","한화","KT"]
vic =[61,54,49,49,46,49,46,38,36,29]
eq =[0,1,1,1,1,1,2,4,1,0]
de =[32,37,40,44,42,46,45,53,55,63]
vrto = np.round( np.array(vic)/( np.array(vic)+ np.array(de))*1000 )/1000
df = DataFrame({"순위":no,"팀명":team,"승":vic,"무":eq,"패":de,"승률":vrto},
               columns=["순위","팀명","승","무","패","승률"])
df.index=no
print(df)
df2=df.reindex([1,2,3,4,5,6,7,8,10,11],fill_value=0)
print("리인덱싱\n",df2)
df3=df.drop([5])
print("삭제후\n",df3)
teamlen = len(df)
print("길이:",teamlen)
df4=df.drop([teamlen-1,teamlen])
print("삭제후\n",df4)
## data["name"]
df5=df[0:4]
print("df5:\n",df5)
print(df5[["팀명","승률"]])
