
  package gen;
  public class W_Gen30 {
  		@com.google.inject.Inject
  		public W_Gen30(W_Gen31 w_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  