
  package gen;
  public class H_Gen195 {
  		@com.google.inject.Inject
  		public H_Gen195(H_Gen196 h_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  