
  package gen;
  public class W_Gen90 {
  		@com.google.inject.Inject
  		public W_Gen90(W_Gen91 w_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  