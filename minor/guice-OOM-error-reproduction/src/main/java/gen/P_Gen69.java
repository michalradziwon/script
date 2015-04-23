
  package gen;
  public class P_Gen69 {
  		@com.google.inject.Inject
  		public P_Gen69(P_Gen70 p_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  