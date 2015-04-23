
  package gen;
  public class H_Gen71 {
  		@com.google.inject.Inject
  		public H_Gen71(H_Gen72 h_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  