
  package gen;
  public class S_Gen183 {
  		@com.google.inject.Inject
  		public S_Gen183(S_Gen184 s_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  