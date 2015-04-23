
  package gen;
  public class W_Gen100 {
  		@com.google.inject.Inject
  		public W_Gen100(W_Gen101 w_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  