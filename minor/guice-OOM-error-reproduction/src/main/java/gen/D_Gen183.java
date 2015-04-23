
  package gen;
  public class D_Gen183 {
  		@com.google.inject.Inject
  		public D_Gen183(D_Gen184 d_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  