
  package gen;
  public class P_Gen134 {
  		@com.google.inject.Inject
  		public P_Gen134(P_Gen135 p_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  