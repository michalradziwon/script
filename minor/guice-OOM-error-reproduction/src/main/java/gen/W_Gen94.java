
  package gen;
  public class W_Gen94 {
  		@com.google.inject.Inject
  		public W_Gen94(W_Gen95 w_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  