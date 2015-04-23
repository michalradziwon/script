
  package gen;
  public class H_Gen177 {
  		@com.google.inject.Inject
  		public H_Gen177(H_Gen178 h_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  