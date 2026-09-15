# Write your MySQL query statement below
select x, y, z, 
case when (x+y)>z and (y+z)>x and (x+z)>y then 'Yes'
else 'No'
end as triangle
from Triangle;

-- select *, if(x+y>z and x+z>y and y+z>x, 'Yes', 'No' ) as triangle from Triangle 