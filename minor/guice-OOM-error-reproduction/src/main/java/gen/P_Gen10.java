
  package gen;
  public class P_Gen10 {
  		@com.google.inject.Inject
  		public P_Gen10(P_Gen11 p_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  