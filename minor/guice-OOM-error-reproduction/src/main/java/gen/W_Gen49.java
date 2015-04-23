
  package gen;
  public class W_Gen49 {
  		@com.google.inject.Inject
  		public W_Gen49(W_Gen50 w_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  