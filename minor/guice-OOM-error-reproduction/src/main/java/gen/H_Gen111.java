
  package gen;
  public class H_Gen111 {
  		@com.google.inject.Inject
  		public H_Gen111(H_Gen112 h_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  