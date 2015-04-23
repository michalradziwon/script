
  package gen;
  public class W_Gen123 {
  		@com.google.inject.Inject
  		public W_Gen123(W_Gen124 w_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  