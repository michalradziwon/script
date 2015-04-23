
  package gen;
  public class P_Gen86 {
  		@com.google.inject.Inject
  		public P_Gen86(P_Gen87 p_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  