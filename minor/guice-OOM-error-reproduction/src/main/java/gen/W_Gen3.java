
  package gen;
  public class W_Gen3 {
  		@com.google.inject.Inject
  		public W_Gen3(W_Gen4 w_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  