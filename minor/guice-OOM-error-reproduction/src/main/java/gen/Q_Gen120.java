
  package gen;
  public class Q_Gen120 {
  		@com.google.inject.Inject
  		public Q_Gen120(Q_Gen121 q_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  