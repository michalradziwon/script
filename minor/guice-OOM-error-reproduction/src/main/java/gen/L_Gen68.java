
  package gen;
  public class L_Gen68 {
  		@com.google.inject.Inject
  		public L_Gen68(L_Gen69 l_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  