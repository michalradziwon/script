
  package gen;
  public class H_Gen196 {
  		@com.google.inject.Inject
  		public H_Gen196(H_Gen197 h_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  