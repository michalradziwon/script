
  package gen;
  public class W_Gen118 {
  		@com.google.inject.Inject
  		public W_Gen118(W_Gen119 w_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  