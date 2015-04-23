
  package gen;
  public class H_Gen120 {
  		@com.google.inject.Inject
  		public H_Gen120(H_Gen121 h_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  