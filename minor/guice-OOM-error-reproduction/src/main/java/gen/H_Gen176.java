
  package gen;
  public class H_Gen176 {
  		@com.google.inject.Inject
  		public H_Gen176(H_Gen177 h_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  