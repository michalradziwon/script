
  package gen;
  public class W_Gen92 {
  		@com.google.inject.Inject
  		public W_Gen92(W_Gen93 w_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  