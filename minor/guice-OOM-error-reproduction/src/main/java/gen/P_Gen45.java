
  package gen;
  public class P_Gen45 {
  		@com.google.inject.Inject
  		public P_Gen45(P_Gen46 p_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  