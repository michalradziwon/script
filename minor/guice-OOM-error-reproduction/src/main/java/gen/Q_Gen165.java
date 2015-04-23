
  package gen;
  public class Q_Gen165 {
  		@com.google.inject.Inject
  		public Q_Gen165(Q_Gen166 q_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  