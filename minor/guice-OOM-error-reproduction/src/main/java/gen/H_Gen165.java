
  package gen;
  public class H_Gen165 {
  		@com.google.inject.Inject
  		public H_Gen165(H_Gen166 h_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  