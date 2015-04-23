
  package gen;
  public class H_Gen183 {
  		@com.google.inject.Inject
  		public H_Gen183(H_Gen184 h_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  