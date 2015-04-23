
  package gen;
  public class W_Gen188 {
  		@com.google.inject.Inject
  		public W_Gen188(W_Gen189 w_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  