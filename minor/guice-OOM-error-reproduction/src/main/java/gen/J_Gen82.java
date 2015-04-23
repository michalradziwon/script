
  package gen;
  public class J_Gen82 {
  		@com.google.inject.Inject
  		public J_Gen82(J_Gen83 j_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  