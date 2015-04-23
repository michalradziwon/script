
  package gen;
  public class P_Gen144 {
  		@com.google.inject.Inject
  		public P_Gen144(P_Gen145 p_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  