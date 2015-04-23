
  package gen;
  public class W_Gen55 {
  		@com.google.inject.Inject
  		public W_Gen55(W_Gen56 w_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  