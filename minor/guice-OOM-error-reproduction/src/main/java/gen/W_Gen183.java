
  package gen;
  public class W_Gen183 {
  		@com.google.inject.Inject
  		public W_Gen183(W_Gen184 w_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  