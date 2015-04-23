
  package gen;
  public class W_Gen48 {
  		@com.google.inject.Inject
  		public W_Gen48(W_Gen49 w_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  