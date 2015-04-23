
  package gen;
  public class W_Gen85 {
  		@com.google.inject.Inject
  		public W_Gen85(W_Gen86 w_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  