
  package gen;
  public class P_Gen165 {
  		@com.google.inject.Inject
  		public P_Gen165(P_Gen166 p_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  