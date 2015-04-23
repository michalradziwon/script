
  package gen;
  public class W_Gen95 {
  		@com.google.inject.Inject
  		public W_Gen95(W_Gen96 w_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  