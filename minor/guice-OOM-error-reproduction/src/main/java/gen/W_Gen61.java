
  package gen;
  public class W_Gen61 {
  		@com.google.inject.Inject
  		public W_Gen61(W_Gen62 w_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  