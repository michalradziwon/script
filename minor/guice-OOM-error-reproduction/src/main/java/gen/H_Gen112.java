
  package gen;
  public class H_Gen112 {
  		@com.google.inject.Inject
  		public H_Gen112(H_Gen113 h_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  