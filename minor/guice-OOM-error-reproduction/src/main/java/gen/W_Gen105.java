
  package gen;
  public class W_Gen105 {
  		@com.google.inject.Inject
  		public W_Gen105(W_Gen106 w_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  