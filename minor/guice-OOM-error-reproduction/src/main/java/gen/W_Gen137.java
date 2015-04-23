
  package gen;
  public class W_Gen137 {
  		@com.google.inject.Inject
  		public W_Gen137(W_Gen138 w_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  