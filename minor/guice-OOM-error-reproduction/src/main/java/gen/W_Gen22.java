
  package gen;
  public class W_Gen22 {
  		@com.google.inject.Inject
  		public W_Gen22(W_Gen23 w_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  