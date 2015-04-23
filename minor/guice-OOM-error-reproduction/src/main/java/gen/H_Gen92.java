
  package gen;
  public class H_Gen92 {
  		@com.google.inject.Inject
  		public H_Gen92(H_Gen93 h_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  