
  package gen;
  public class P_Gen196 {
  		@com.google.inject.Inject
  		public P_Gen196(P_Gen197 p_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  