
  package gen;
  public class L_Gen10 {
  		@com.google.inject.Inject
  		public L_Gen10(L_Gen11 l_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  