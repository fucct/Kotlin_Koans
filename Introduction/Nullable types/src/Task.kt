import java.lang.NullPointerException

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val personalInfo: PersonalInfo = client?.personalInfo ?: return
    val email: String = personalInfo.email ?: return
    val message1 = message ?: return
    mailer.sendMessage(email, message1)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
