
  package gen;
  public class Q_Gen74 {
  		@com.google.inject.Inject
  		public Q_Gen74(Q_Gen75 q_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  