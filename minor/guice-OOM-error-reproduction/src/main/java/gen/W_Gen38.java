
  package gen;
  public class W_Gen38 {
  		@com.google.inject.Inject
  		public W_Gen38(W_Gen39 w_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  