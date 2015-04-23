
  package gen;
  public class H_Gen82 {
  		@com.google.inject.Inject
  		public H_Gen82(H_Gen83 h_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  