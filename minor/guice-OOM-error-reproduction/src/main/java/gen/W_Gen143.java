
  package gen;
  public class W_Gen143 {
  		@com.google.inject.Inject
  		public W_Gen143(W_Gen144 w_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  