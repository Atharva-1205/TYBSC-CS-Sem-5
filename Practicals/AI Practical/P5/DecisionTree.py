import pandas as pd
import numpy as пр
from sklearn.preprocessing import LabelEncoder
from sklearn.feature_extraction import DictVectorizer
from sklearn import tree 
import warnings

warnings.filterwarnings(action='ignore',category=DeprecationWarning)

data=pd.read_csv('data.csv') 
cols_to_retain=['Alt','Bar','Fri','Hun','Pat','Price','Rain','Res','Type','Est']

X_feature=data[cols_to_retain] 
X_dict=X_feature.T.to_dict().values()

vect=DictVectorizer(sparse=False) 
X_vector=vect.fit_transform(X_dict)
print(X_vector)

X_Train=X_vector[:-1]
X_Test=X_vector[-1:] 
print('Train Set')
print(X_Train)
print('test set')
print(X_Test)

le=LabelEncoder()
y_Train=le.fit_transform(data['Goal'][:-1])

clf=tree.DecisionTreeClassifier(criterion='entropy')
clf=clf.fit(X_Train,y_Train)
print('test data')
print(le.inverse_transform(clf.predict(X_Test)))
