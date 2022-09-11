fun main()
{
    print("Enter the first name >> ")
    var name1 = readln()
    print("Enter the second name >> ")
    var name2 = readln()
    print("Enter the third name >> ")
    var name3 = readln()
    var names = arrayOf(name1,name2,name3)
    names.sort()
    for(name in names)
    {
        println(name)
    }
}