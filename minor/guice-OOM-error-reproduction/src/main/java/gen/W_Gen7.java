
  package gen;
  public class W_Gen7 {
  		@com.google.inject.Inject
  		public W_Gen7(W_Gen8 w_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  