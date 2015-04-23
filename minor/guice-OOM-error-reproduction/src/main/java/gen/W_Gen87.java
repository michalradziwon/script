
  package gen;
  public class W_Gen87 {
  		@com.google.inject.Inject
  		public W_Gen87(W_Gen88 w_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  