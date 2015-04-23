
  package gen;
  public class H_Gen134 {
  		@com.google.inject.Inject
  		public H_Gen134(H_Gen135 h_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  