
  package gen;
  public class J_Gen183 {
  		@com.google.inject.Inject
  		public J_Gen183(J_Gen184 j_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  