
  package gen;
  public class P_Gen147 {
  		@com.google.inject.Inject
  		public P_Gen147(P_Gen148 p_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  