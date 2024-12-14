package feedback6

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class DataSyncJobService : JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Log.d("DataSyncJobService", "Sincronización iniciada")
        // Aquí puedes implementar lógica de sincronización.
        jobFinished(params, false)
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d("DataSyncJobService", "Sincronización detenida")
        return true
    }
}
