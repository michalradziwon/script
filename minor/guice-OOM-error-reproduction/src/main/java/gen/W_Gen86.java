
  package gen;
  public class W_Gen86 {
  		@com.google.inject.Inject
  		public W_Gen86(W_Gen87 w_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  