
  package gen;
  public class L_Gen82 {
  		@com.google.inject.Inject
  		public L_Gen82(L_Gen83 l_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  