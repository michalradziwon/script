
  package gen;
  public class W_Gen18 {
  		@com.google.inject.Inject
  		public W_Gen18(W_Gen19 w_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  