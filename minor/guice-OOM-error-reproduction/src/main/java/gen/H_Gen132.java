
  package gen;
  public class H_Gen132 {
  		@com.google.inject.Inject
  		public H_Gen132(H_Gen133 h_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  