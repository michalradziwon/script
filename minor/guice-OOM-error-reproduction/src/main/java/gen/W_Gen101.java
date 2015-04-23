
  package gen;
  public class W_Gen101 {
  		@com.google.inject.Inject
  		public W_Gen101(W_Gen102 w_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  