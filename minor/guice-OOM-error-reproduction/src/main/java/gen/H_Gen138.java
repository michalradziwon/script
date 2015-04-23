
  package gen;
  public class H_Gen138 {
  		@com.google.inject.Inject
  		public H_Gen138(H_Gen139 h_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  