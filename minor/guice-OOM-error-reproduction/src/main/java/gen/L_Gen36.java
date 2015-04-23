
  package gen;
  public class L_Gen36 {
  		@com.google.inject.Inject
  		public L_Gen36(L_Gen37 l_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  