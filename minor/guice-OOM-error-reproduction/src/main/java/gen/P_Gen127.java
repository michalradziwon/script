
  package gen;
  public class P_Gen127 {
  		@com.google.inject.Inject
  		public P_Gen127(P_Gen128 p_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  