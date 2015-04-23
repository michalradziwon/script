
  package gen;
  public class L_Gen9 {
  		@com.google.inject.Inject
  		public L_Gen9(L_Gen10 l_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  