
  package gen;
  public class H_Gen69 {
  		@com.google.inject.Inject
  		public H_Gen69(H_Gen70 h_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  