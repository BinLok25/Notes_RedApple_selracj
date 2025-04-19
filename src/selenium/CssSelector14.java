package selenium;

public class CssSelector14 {
	/**
	 * 
	 * for id use #
#id
tagname#id

for class use dot
.username
tagname.username

with attributes:
tagname[attr='value']

attri could be id, classname as well

For multiple attris multiple square brackets:
input[id='input-email][type='text'][name='email']

contains represented by *=
input[placeholder*='Address']

startswith represented by ^=
input[placeholder^='E-mail']

endswith Not there in xpath But exists in css and is represented by $=
input[placeholder$='Address']

text in css??-not supported But available in xpath

parent to child concept in css?? Yes
direct child represented by parent>child
form#hs-login > div

direct+ indirect relationship represented by one space + child
==> a space between parent and child
form#hs-login div

can we create css for drop down??

Backward traversing not available in css

child to parent, child to grand parent: not allowed

preceding sibling: not allowed since is in backward direction

Do we have any sibling concept in CSS?? Yes
immediate single following sibling - represented by +
option[value='Algeria'] + option


immediate all following siblings - represented by ~
option[value='Algeria'] ~ option

can write comma also in css:3 separate eles added using comma
input#username,input#password,button#loginBtn
used case: says that i really want to check these 3 eles exist on the page OR NOT

not in css:represented by :not(css of the ele u want to exclude)
div.form-group > input.form-control:not(#input-email)

not in : exists in xpath as well:


Do we have indexing in css??represented by nth-of-type(index no)
to do the same in xpath-we were storing in the captcha group and then were supplying the index
select#form_getForm_country > option:nth-of-type(5)

selects all
select#form_getForm_country > option:nth-of-type(n)

In css, there are other indexing concepts:
select#form_getForm_country > option:first-child

select#form_getForm_country > option:last-child

select#form_getForm_country > option:nth-child(4)

select#form_getForm_country > option:nth-child(n)

select#form_getForm_country > option:nth-last-child(2)

select#form_getForm_country > option:nth-child(odd)

select#form_getForm_country > option:nth-child(even)

select#form_getForm_country > option:nth-child(n+4)

select#form_getForm_country > option:nth-child(n-4)

select#form_getForm_country > option:nth-child(4n)

write a blog for odd/even in xpath??

can i use cascaded css with By.cssSelector()? yes
if u write By.classname with multiple classes it is invalid--cannot use multiple classes inside
By.classname(class1.class2.class3....)

which one is getting loaded first dom/css??dom

for every browser -xpath engine is different

wrong syntax of xpath/css selector -throws invalid/illegal selector exception

if there is a text in the dom with a space ' Yes'
then write xpath with normalize-space()
//label[normalize-space(), ' Yes']
	 * 
	 * 
	 * 
	 * 
	 */

}
