import dev from '~/config/api/dev'
import prod from '~/config/api/prod'

export default process.env.NODE_ENV === 'dev' ? dev : prod
