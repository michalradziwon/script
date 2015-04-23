
  package gen;
  public class H_Gen78 {
  		@com.google.inject.Inject
  		public H_Gen78(H_Gen79 h_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  