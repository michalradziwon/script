
  package gen;
  public class W_Gen4 {
  		@com.google.inject.Inject
  		public W_Gen4(W_Gen5 w_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  