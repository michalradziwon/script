
  package gen;
  public class W_Gen181 {
  		@com.google.inject.Inject
  		public W_Gen181(W_Gen182 w_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  