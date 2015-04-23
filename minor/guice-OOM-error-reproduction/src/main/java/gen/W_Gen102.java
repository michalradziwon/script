
  package gen;
  public class W_Gen102 {
  		@com.google.inject.Inject
  		public W_Gen102(W_Gen103 w_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  