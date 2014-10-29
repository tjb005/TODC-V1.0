<script type=text/javascript>
function collapseElement(obj)
{
        var el = document.getElementById(obj);
        el.style.display = 'none';
}
function expandElement(obj)
{
        var el = document.getElementById(obj);
        el.style.display = '';
}
function collapsePages()
{
        var numFormPages = 3;
        for(i=2; i <= numFormPages; i++)
        {
                currPageId = ('page_' + i);
                collapseElement(currPageId);
        }
}
</script>