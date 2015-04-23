
  package gen;
  public class L_Gen41 {
  		@com.google.inject.Inject
  		public L_Gen41(L_Gen42 l_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  