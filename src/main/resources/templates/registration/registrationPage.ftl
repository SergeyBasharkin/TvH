<#include "../main/mainTemplates.ftl">
<@mainTemplate title="Регистрация" styles=[] scripts=[] />
<#macro m_body>
<form method="post" action="/signup">

    <label>Name</label>
    <#--<#if errors??>-->
        <#--<#list errors as error>-->
            <#--<#if error.field=="name">-->
                         <#--${error.defaultMessage}-->
            <#--</#if>-->
    <#if nameError??>
    ${nameError.defaultMessage}</#if>
            <input type="text" title="Name" name="name"><br>
            <label>email</label>
    <#if emailError??>
    ${emailError.defaultMessage}</#if>
            <input type="email" title="email" name="email"><br>
            <label>Password</label>
    <#if passwordError??>
    ${passwordError.defaultMessage}</#if>
            <input type="password" title="password" name="password"><br>
    <#if validError??>
    ${validError.defaultMessage}</#if>
            <label>Confirm password</label>
            <input type="password" title="confirm password" name="confirmPassword"><br>
        <#--</#list></#if>-->
    <input type="submit">
</form>
</#macro>