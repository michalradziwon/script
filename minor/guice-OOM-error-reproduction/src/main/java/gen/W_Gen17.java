
  package gen;
  public class W_Gen17 {
  		@com.google.inject.Inject
  		public W_Gen17(W_Gen18 w_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  