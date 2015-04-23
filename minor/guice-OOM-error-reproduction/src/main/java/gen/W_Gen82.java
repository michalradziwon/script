
  package gen;
  public class W_Gen82 {
  		@com.google.inject.Inject
  		public W_Gen82(W_Gen83 w_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  