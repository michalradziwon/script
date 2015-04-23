
  package gen;
  public class L_Gen64 {
  		@com.google.inject.Inject
  		public L_Gen64(L_Gen65 l_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  