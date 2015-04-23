
  package gen;
  public class Q_Gen127 {
  		@com.google.inject.Inject
  		public Q_Gen127(Q_Gen128 q_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  