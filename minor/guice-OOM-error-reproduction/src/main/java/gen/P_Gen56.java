
  package gen;
  public class P_Gen56 {
  		@com.google.inject.Inject
  		public P_Gen56(P_Gen57 p_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  