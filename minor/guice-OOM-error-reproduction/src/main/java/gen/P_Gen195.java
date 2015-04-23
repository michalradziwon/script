
  package gen;
  public class P_Gen195 {
  		@com.google.inject.Inject
  		public P_Gen195(P_Gen196 p_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  