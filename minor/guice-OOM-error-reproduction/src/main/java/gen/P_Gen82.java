
  package gen;
  public class P_Gen82 {
  		@com.google.inject.Inject
  		public P_Gen82(P_Gen83 p_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  