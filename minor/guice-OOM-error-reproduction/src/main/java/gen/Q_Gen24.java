
  package gen;
  public class Q_Gen24 {
  		@com.google.inject.Inject
  		public Q_Gen24(Q_Gen25 q_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  